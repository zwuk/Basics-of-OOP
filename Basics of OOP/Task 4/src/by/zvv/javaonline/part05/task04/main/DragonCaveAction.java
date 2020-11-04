package by.zvv.javaonline.part05.task04.main;

import java.util.ArrayList;
import java.util.List;

import by.zvv.javaonline.part05.task04.entity.DragonCave;
import by.zvv.javaonline.part05.task04.entity.Treasure;
import by.zvv.javaonline.part05.task04.logic.TreasureFilter;
import by.zvv.javaonline.part05.task04.logic.TreasureSorter;
import by.zvv.javaonline.part05.task04.logic.UserInput;
import by.zvv.javaonline.part05.task04.storage.TreasureCSVStorage;
import by.zvv.javaonline.part05.task04.storage.TreasureStorage;
import by.zvv.javaonline.part05.task04.view.TreasureView;

public class DragonCaveAction {

	private DragonCave cave;
	
	private TreasureStorage storage;
	private TreasureView view;
	private TreasureSorter sorter;
	private TreasureFilter filter;
	
	{
		storage = new TreasureCSVStorage();
		view = new TreasureView();
		sorter = new TreasureSorter();
		filter = new TreasureFilter();
	}
	
	public DragonCaveAction(DragonCave cave) {
		this.cave = cave;
	}
	
	public DragonCaveAction(DragonCave cave, TreasureStorage storage) {
		this.cave = cave;
		this.storage = storage;
	}

	public DragonCave getCave() {
		return cave;
	}

	public TreasureStorage getStorage() {
		return storage;
	}

	public TreasureView getView() {
		return view;
	}

	public TreasureSorter getSorter() {
		return sorter;
	}

	public TreasureFilter getFilter() {
		return filter;
	}

	public void setStorage(TreasureStorage storage) {
		this.storage = storage;
	}
	
	public void showAllTreasure(List<Treasure> treasures) {
		view.showTreasureList(treasures);
	}
	
	public void showMostExpenciveTreasure() {
		List<Treasure> treasures = new ArrayList<>(cave.getTreasures());
		treasures = filter.getMostExpensive(treasures);
		view.showTreasureList(treasures);
	}
	
	public void showTreasureListForAmount() {
		List<Treasure> treasures = new ArrayList<>(cave.getTreasures());
		UserInput amount = new UserInput();
		treasures = sorter.byRandom(treasures);
		treasures = filter.getListForAmount(treasures, amount.getInt());
		view.showTreasureList(treasures);
	}
	
	public void loadTreasures() {
		storage.loadTreasureList(cave.getTreasures());
	}

	public void saveTreasures() {
        storage.saveTreasureList(cave.getTreasures());
    }

}
