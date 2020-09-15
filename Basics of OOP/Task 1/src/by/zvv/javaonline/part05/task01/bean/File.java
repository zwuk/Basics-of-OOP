package by.zvv.javaonline.part05.task01.bean;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import by.zvv.javaonline.part05.task01.interfaces.FileInterface;

public class File implements Serializable, FileInterface {
	private Directory directory;
	private String name;
	private String content;

	private static final long serialVersionUID = 301077366599181567L;
	
	{
		this.content = "";
	}

	public File(Directory directory) {
		this.directory = directory;
	}

	public File(Directory directory, String name) {
		this.directory = directory;
		this.name = name;
	}

	public Directory getDirectory() {
		return directory;
	}

	public String getName() {
		return name;
	}

	public String getContent() {
		return content;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getFileNameWithoutExtension(String fileName) {
		int index = fileName.lastIndexOf('.');
		if (index == -1) {
			return fileName;
		}
		return fileName.substring(0, index);
	}

	public String getFileContent() {
		String lineSeparator = System.getProperty("line.separator");// Переменная переноса строки для различных платформ
		String content = "";
		String lineContent;
		String filePath = this.getDirectory().getName() + this.getName();

		try (FileInputStream fin = new FileInputStream(filePath);
				BufferedReader br = new BufferedReader(new InputStreamReader(fin))) {
			while ((lineContent = br.readLine()) != null) {
				content += lineContent + lineSeparator;
			}
		} catch (IOException exc) {
			System.out.println(exc);
		}
		return content;
	}

	@Override
	public void create() {
		Path path = Paths.get(directory.getName() + name);
		if (Files.exists(path)) {
			System.out.println("Файл " + path + " уже имеется");
		} else {
			try {
				Files.createFile(path);
			} catch (IOException exc) {
				System.out.println(exc);
			}
		}
	}

	@Override
	public void rename(String newName) {
		Path path1 = Paths.get(directory.getName() + name);
		Path path2 = Paths.get(directory.getName() + newName);

		if (Files.notExists(path1)) {
			System.out.println("Файл " + path1 + " отсутствует");
		} else if (Files.exists(path2)) {
			System.out.println("Файл " + path2 + " уже имеется");
		} else {
			try {
				Files.move(path1, path2);
			} catch (IOException exc) {
				System.out.println(exc);
			}
			name = newName;
		}
	}

	@Override
	public void printContentToConsole() {
		System.out.println(getContent());
	}

	@Override
	public void addContent(String content) {
		String filePath = this.getDirectory().getName() + this.getName();
		
// 		try {Files.write(Paths.get(filePath, content.getBytes(), StandartOpenOption.APPEND);}
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
			bw.write(content);
			this.content += content;
		} catch (IOException exc) {
			System.out.println(exc);
		}
	}

	@Override
	public void delete() {
		Path path = Paths.get(directory.getName() + name);
		if (Files.notExists(path)) {
			System.out.println("Файл " + path + " отсутствует");
		} else {
			try {
				Files.deleteIfExists(path);
			} catch (IOException exc) {
				System.out.println(exc);
			}
		}
		this.directory = null;
		this.name = null;
		this.content = null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((directory == null) ? 0 : directory.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		File other = (File) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (directory == null) {
			if (other.directory != null)
				return false;
		} else if (!directory.equals(other.directory))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [directory=" + directory + ", name=" + name + ", content=" + content + "]";
	}

}
