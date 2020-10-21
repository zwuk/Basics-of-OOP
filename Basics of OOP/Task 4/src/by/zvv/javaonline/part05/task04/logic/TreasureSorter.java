package by.zvv.javaonline.part05.task04.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import by.zvv.javaonline.part05.task04.entity.Treasure;

public class TreasureSorter {

	public List<Treasure> byName(List<Treasure> treasures) {
		List<Treasure> sortedList = new ArrayList<>(treasures);
		Comparator<Treasure> comp = Comparator.comparing(Treasure::getName);

		sortedList.sort(comp);

		return sortedList;
	}

	public List<Treasure> byPrice(List<Treasure> treasures) {
		List<Treasure> sortedList = new ArrayList<>(treasures);
		Comparator<Treasure> comp = Comparator.comparing(Treasure::getPrice);

		sortedList.sort(comp);

		return sortedList;
	}

	public List<Treasure> byRandom(List<Treasure> treasures) {
		List<Treasure> sortedList = new ArrayList<>(treasures);

// Перемешивание массива в ручном режиме
		Random rand = new Random();
		Treasure tempTreasure;
		int number = sortedList.size();
		for (int i = 0; i < number; i++) {
			int tempIndex = i + rand.nextInt(number - i);
			tempTreasure = sortedList.get(i);
			sortedList.set(i, sortedList.get(tempIndex));
			sortedList.set(tempIndex, tempTreasure);
		}

/* Перемешивание массива с использованием Collections
 *
 * 		Collections.shuffle(sortedList);
 */
		return sortedList;
	}
}
