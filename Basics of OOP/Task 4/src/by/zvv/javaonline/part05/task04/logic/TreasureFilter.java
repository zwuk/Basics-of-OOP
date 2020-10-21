package by.zvv.javaonline.part05.task04.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import by.zvv.javaonline.part05.task04.entity.Treasure;

public class TreasureFilter {

	public List<Treasure> getMostExpensive(List<Treasure> treasures) {
		List<Treasure> list = new ArrayList<>();
		
/*	Находим максимальную стоимость сокровища. Ниже то же самое, но с использованием Collections	
 * 		int cost = 0;
 *
 *		for (Treasure treasure : treasures) {
 *			cost = (treasure.getPrice() > cost) ? treasure.getPrice() : cost;
 *		}
 *		
 *		int maxPrice = cost;
 */			
		int maxPrice = Collections.max(treasures, Comparator.comparing(Treasure::getPrice)).getPrice();

		list = treasures.stream().filter(treasure -> treasure.getPrice() == maxPrice).collect(Collectors.toList());
		
		return list;
	}

	public List<Treasure> getListForAmount(List<Treasure> treasures, int amount) {
		List<Treasure> list = new ArrayList<>();
		
		for (Treasure treasure : treasures) {
			if (treasure.getPrice() <= amount) {
				list.add(treasure);
				amount -= treasure.getPrice();
			}
		}
		
		return list;
	}
}
