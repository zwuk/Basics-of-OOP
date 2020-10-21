package by.zvv.javaonline.part05.task04.view;

import java.util.List;

import by.zvv.javaonline.part05.task04.entity.Treasure;

public class TreasureView {

	private void showListHeader() {
		System.out.printf("| %-32s | %-10s |\n", "СОКРОВИЩЕ", "СТОИМОСТЬ");
		for (int i = 0; i < 49; i++) {
			System.out.print('-');
		}
		System.out.println();
	}

	private void showTreasure(Treasure treasure) {
		System.out.printf("| %-32s | %4d монет |\n", treasure.getName(), treasure.getPrice());
	}
	
	public void showTreasureList(List<Treasure> treasures) {
		showListHeader();
		for(Treasure treasure : treasures) {
			showTreasure(treasure);
		}
		for (int i = 0; i < 49; i++) {
			System.out.print('-');
		}
		System.out.println();
	}
}
