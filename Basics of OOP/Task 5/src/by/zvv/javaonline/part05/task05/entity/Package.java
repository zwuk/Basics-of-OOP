package by.zvv.javaonline.part05.task05.entity;

import java.math.BigDecimal;
import java.util.Objects;

import by.zvv.javaonline.part05.task05.builder.CompositionElement;

public class Package implements CompositionElement {
	
	private final String name;
	private BigDecimal price;

	
	public Package(String name) {
		this.name = name;
	}

	public Package(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String getElementName() {
		return name;
	}

	@Override
	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Package other = (Package) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getClass().getSimpleName());
		builder.append(" [name=");
		builder.append(name);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}

}
