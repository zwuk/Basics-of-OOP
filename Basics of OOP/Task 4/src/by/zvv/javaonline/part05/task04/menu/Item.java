package by.zvv.javaonline.part05.task04.menu;

import java.io.Serializable;
import java.util.Objects;

public class Item implements Serializable{

	private static final long serialVersionUID = -4677879695900814604L;
	
	private String description;
	private int label;

	public Item() {
	}

	public Item(String description, int label) {
		this.description = description;
		this.label = label;
	}

	public String getDescription() {
		return description;
	}

	public int getLabel() {
		return label;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setLabel(int label) {
		this.label = label;
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, label);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(description, other.description) && label == other.label;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getClass().getSimpleName());
		builder.append(" [description=");
		builder.append(description);
		builder.append(", label=");
		builder.append(label);
		builder.append("]");
		return builder.toString();
	}

}
