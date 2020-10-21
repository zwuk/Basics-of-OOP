package by.zvv.javaonline.part05.task04.storage;

import java.util.List;

import by.zvv.javaonline.part05.task04.entity.Treasure;

public interface TreasureStorage {

	public void saveTreasureList(List<Treasure> treasures);
	
	public void loadTreasureList(List<Treasure> treasures);
	
}
