package by.zvv.javaonline.part05.task05.logic;

import java.util.Map;

import by.zvv.javaonline.part05.task05.builder.CompositionElement;
import by.zvv.javaonline.part05.task05.entity.Bouquet;

public class FlowerShopAction {
	
	public void showBouquetComposition(String str, Bouquet bouquet) {

		System.out.println(str);
		for(Map.Entry<CompositionElement, Integer> entry : bouquet.getBouquetComposition().entrySet()) {
			StringBuilder sb = new StringBuilder();
			sb.append(entry.getKey().getElementName());
			sb.append("в количестве: ");
			sb.append(entry.getValue());
//			sb.append(" по цене ");
//			sb.append(entry.getKey().getPrice());
			System.out.println(sb.toString());
		}
	}
	
	public void getCostBouquetComposition(String str, Bouquet bouquet) {
		double cost = 0;
		for(Map.Entry<CompositionElement, Integer> entry : bouquet.getBouquetComposition().entrySet()) {
			cost += entry.getKey().getPrice().doubleValue() * entry.getValue(); 
		}
		System.out.print("Стоимость цветочной композиции: " + cost + " р.");
		
	}
	
	public Bouquet createComposition() {
		return new Bouquet();
	}
}
