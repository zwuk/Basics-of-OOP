package by.zvv.javaonline.part05.task04.menu.main;

import by.zvv.javaonline.part05.task04.menu.Item;
import by.zvv.javaonline.part05.task04.menu.Menu;
import by.zvv.javaonline.part05.task04.menu.MenuBuilder;

public class MainMenuBuilder implements MenuBuilder{

	@Override
	public void build(Menu menu) {
		menu.addItem(new Item("Показать все сокровища", 1));
		menu.addItem(new Item("Показать самое дорогое сокровище", 2));
		menu.addItem(new Item("Выбрать сокровища на заданную сумму", 3));
		menu.addItem(new Item("Выход из программы", 0));		
	}

}
