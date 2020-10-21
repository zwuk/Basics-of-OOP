package by.zvv.javaonline.part05.task04.view;

import by.zvv.javaonline.part05.task04.logic.DragonCaveAction;
import by.zvv.javaonline.part05.task04.menu.Menu;
import by.zvv.javaonline.part05.task04.menu.MenuView;
import by.zvv.javaonline.part05.task04.menu.main.MainMenu;

public class MainMenuView extends MenuView {

	private DragonCaveAction action;
	private Menu menu;

	{
		menu = new MainMenu();
		menu.buildMenu();
	}
	
	public MainMenuView(DragonCaveAction action) {
		this.action = action;
	}

	@Override
	public void run() {

		while (true) {
			showMenu(menu);
			switch (getOption(menu)) {
			case 1:
				SortedMenuView sortMenu = new SortedMenuView(action);
				sortMenu.run();
				break;
			case 2:
				action.showMostExpenciveTreasure();
				break;
			case 3:
				System.out.print("Укажите сумму, на которую подобрать сокровища: ");
				action.showTreasureListForAmount();
				break;
			case 0:
				action.saveTreasures();
				System.exit(0);
				break;
			default:
				break;
			}
		}

	}

}
