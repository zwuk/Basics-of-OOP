package by.zvv.javaonline.part05.task04.menu;

import java.util.ArrayList;
import java.util.List;

import by.zvv.javaonline.part05.task04.logic.UserInput;

public abstract class MenuView {

	private Menu menu;
	
	public MenuView() {
	}
	
	public MenuView(Menu menu) {
		this.menu = menu;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	private void showItem(Item item) {
		StringBuilder sb = new StringBuilder();
		sb.append(item.getLabel());
		sb.append(" - ");
		sb.append(item.getDescription());
		System.out.println(sb);
	}
	
	public void showMenu(Menu menu) {
		for (Item item : menu.getItems()) {
			showItem(item);
		}
		System.out.print("Сделайте ваш выбор: ");
	}
	
	public int getOption(Menu menu) {
		List<Integer> allOptions = new ArrayList<>();
		UserInput input = new UserInput();
		
		for(Item item : menu.getItems()) {
			allOptions.add(item.getLabel());
		}
		
		Integer option = input.getInt();
		
		while(!allOptions.contains(option)) {
			option = input.getInt();
		}
		
		return option;
	}
	
	public abstract void run();
	
}
