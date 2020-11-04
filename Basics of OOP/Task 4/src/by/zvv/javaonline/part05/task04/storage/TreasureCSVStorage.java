package by.zvv.javaonline.part05.task04.storage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import by.zvv.javaonline.part05.task04.entity.Treasure;

public class TreasureCSVStorage implements TreasureStorage{
	
	private final String workDir = System.getProperty("user.dir");
	private final File file = new File(workDir + "/resource/treasures.csv");
	private final String lineSeparator = System.getProperty("line.separator"); //Переменная переноса строки для различных платформ
	private final String separator = ",";

	@Override
	public void saveTreasureList(List<Treasure> treasures) {
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			for(Treasure treasure : treasures) {
				bw.write(treasure.getName() + separator + treasure.getPrice() + lineSeparator);
			}
			bw.flush();
		} catch (IOException exc) {
			exc.printStackTrace();
		}
		
	}

	@Override
	public void loadTreasureList(List<Treasure> treasures) {
		
		treasures.clear();
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = "";
			while((line = br.readLine()) != null) {
				String[] strTemp = line.split(separator);
				Treasure treasure = new Treasure(strTemp[0], Integer.parseInt(strTemp[1]));
				treasures.add(treasure);
			}
		} catch (IOException exc) {
			exc.printStackTrace();
		}
		
	}

}
