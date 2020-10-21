package by.zvv.javaonline.part05.task04.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Menu {

	private List<Item> items;
	
	{
		items = new ArrayList<>();
	}
	
	public Menu() {
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public boolean addItem(Item item) {
		return items.add(item);
	}
	
	public boolean removeItem(Item item) {
		return items.remove(item);
	}
	
	public abstract void buildMenu();

	@Override
	public int hashCode() {
		return Objects.hash(items);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Menu other = (Menu) obj;
		return Objects.equals(items, other.items);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getClass().getSimpleName());
		builder.append(" [items=");
		builder.append(items);
		builder.append("]");
		return builder.toString();
	}
	
}
