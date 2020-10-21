package by.zvv.javaonline.part05.task04.view;

import by.zvv.javaonline.part05.task04.logic.DragonCaveAction;
import by.zvv.javaonline.part05.task04.menu.Menu;
import by.zvv.javaonline.part05.task04.menu.MenuView;
import by.zvv.javaonline.part05.task04.menu.sorted.SortedMenu;

public class SortedMenuView extends MenuView {

	private DragonCaveAction action;
	private Menu menu;

	{
		menu = new SortedMenu();
		menu.buildMenu();
	}

	public SortedMenuView(DragonCaveAction action) {
		this.action = action;
	}

	@Override
	public void run() {
		showMenu(menu);
		switch (getOption(menu)) {
		case 1:
			action.showAllTreasure(action.getSorter().byName(action.getCave().getTreasures()));
			break;
		case 2:
			action.showAllTreasure(action.getSorter().byPrice(action.getCave().getTreasures()));
			break;
		case 3:
			action.showAllTreasure(action.getSorter().byRandom(action.getCave().getTreasures()));
			break;
		default:
			break;
		}

	}

}
