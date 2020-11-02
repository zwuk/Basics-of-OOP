package by.zvv.javaonline.part05.task05.entity;

import java.util.HashMap;
import java.util.Map;

import by.zvv.javaonline.part05.task05.builder.CompositionElement;

public class Bouquet {
	
	private Map<CompositionElement, Integer> bouquetComposition;
	
	{
		bouquetComposition = new HashMap<CompositionElement, Integer>();
	}
	
	public Bouquet() {
		
	}

	public Bouquet(Map<CompositionElement, Integer> bouquetComposition) {
		this.bouquetComposition = bouquetComposition;
	}

	public Map<CompositionElement, Integer> getBouquetComposition() {
		return bouquetComposition;
	}

	public void setBouquetComposition(Map<CompositionElement, Integer> bouquetComposition) {
		this.bouquetComposition = bouquetComposition;
	}

	public boolean addElementToComposition(CompositionElement element, int number) {
		
		boolean result = false;	
		
		if(bouquetComposition.containsKey(element)) {
			bouquetComposition.put(element, bouquetComposition.get(element) + number);
			result = true;
		} else {
			bouquetComposition.put(element, number);
			result = true;
		}
		return result;
	}
	
	public boolean removeElementFromComposition(CompositionElement element) {
		
		boolean result = false;
		
		if(bouquetComposition.containsKey(element)) {
			bouquetComposition.remove(element);
			result = true;
		}
		return result;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getClass().getSimpleName());
		builder.append(" [bouquetComposition=");
		builder.append(bouquetComposition);
		builder.append("]");
		return builder.toString();
	}
	
	
}
