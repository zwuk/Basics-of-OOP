package by.zvv.javaonline.part05.task01.interfaces;

/* 
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

public interface FileInterface {

	void create();

	void rename(String newName);
	
	void printContentToConsole();

	void addContent(String content);
	
	void delete();
	
}
