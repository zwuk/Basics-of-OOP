package by.zvv.javaonline.part05.task04.menu.main;

import by.zvv.javaonline.part05.task04.menu.Menu;
import by.zvv.javaonline.part05.task04.menu.MenuBuilder;

public class MainMenu extends Menu{
	
	private MenuBuilder menuBuilder;

	@Override
	public void buildMenu() {
		menuBuilder = new MainMenuBuilder();
		menuBuilder.build(this);
	}

}
