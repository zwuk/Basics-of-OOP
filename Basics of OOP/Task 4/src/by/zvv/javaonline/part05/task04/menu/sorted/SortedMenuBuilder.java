package by.zvv.javaonline.part05.task04.menu.sorted;

import by.zvv.javaonline.part05.task04.menu.Item;
import by.zvv.javaonline.part05.task04.menu.Menu;
import by.zvv.javaonline.part05.task04.menu.MenuBuilder;

public class SortedMenuBuilder implements MenuBuilder {

	@Override
	public void build(Menu menu) {
		menu.addItem(new Item("Отсортированные по имени", 1));
		menu.addItem(new Item("Отсортированные по стоимости", 2));
		menu.addItem(new Item("Предварительно перемешать", 3));
	}

}
