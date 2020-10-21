package by.zvv.javaonline.part05.task04.main;

/* 
 * Задача 4.
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * • Приложение должно быть объектно-, а не процедурно-ориентированным.
 * • Каждый класс должен иметь отражающее смысл название и информативный состав.
 * • Наследование должно применяться только тогда, когда это имеет смысл.
 * • При кодировании должны быть использованы соглашения об оформлении кода java code convention.
 * • Классы должны быть грамотно разложены по пакетам.
 * • Консольное меню должно быть минимальным.
 * • Для хранения данных можно использовать файлы.
 *
 * Дракон и его сокровища. 
 * Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона. 
 * Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища 
 * и выбора сокровищ на заданную сумму.
 */

import by.zvv.javaonline.part05.task04.entity.DragonCave;
import by.zvv.javaonline.part05.task04.logic.DragonCaveAction;
import by.zvv.javaonline.part05.task04.menu.MenuView;
import by.zvv.javaonline.part05.task04.view.MainMenuView;

public class Runner {

	public static void main(String[] args) {
		
// Создаем пещеру дракона		
		DragonCave dragonCave = new DragonCave();
				
// Создаем класс управления пещерой дракона		
		DragonCaveAction action = new DragonCaveAction(dragonCave);

// Загружаем список сокровищ из файла (формат файла можно выбрать при создании
// класса управления пещерой дракона. По умолчанию *.csv)		
		action.loadTreasures();
				
// Создаем главное меню и запускаем его
		MenuView mainMenu = new MainMenuView(action);
		mainMenu.run();
	}

}
