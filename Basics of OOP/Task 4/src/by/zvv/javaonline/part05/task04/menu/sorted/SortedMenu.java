package by.zvv.javaonline.part05.task04.menu.sorted;

import by.zvv.javaonline.part05.task04.menu.Menu;
import by.zvv.javaonline.part05.task04.menu.MenuBuilder;

public class SortedMenu extends Menu{
	
	private MenuBuilder menuBuilder;

	@Override
	public void buildMenu() {
		menuBuilder = new SortedMenuBuilder();
		menuBuilder.build(this);
	}

}
