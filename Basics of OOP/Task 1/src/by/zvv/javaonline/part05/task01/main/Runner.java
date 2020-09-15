package by.zvv.javaonline.part05.task01.main;

import by.zvv.javaonline.part05.task01.bean.Directory;
import by.zvv.javaonline.part05.task01.bean.File;
import by.zvv.javaonline.part05.task01.bean.TextFile;

/* Создать объект класса Текстовый файл, используя классы Файл, Директория. 
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

public class Runner {

	public static void main(String[] args) {
		Directory dir = new Directory("src/by/zvv/javaonline/part05/task01/");
		File file = new TextFile(dir, "File.tmp");

		file.create();
		file.addContent("123456789\n");
		file.addContent("000000000\n");
		file.rename("NewFile");
		file.printContentToConsole();
		file.delete();

	}

}
