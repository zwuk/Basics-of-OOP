package by.zvv.javaonline.part05.task05.entity;

import java.math.BigDecimal;
import java.util.Objects;

import by.zvv.javaonline.part05.task05.builder.CompositionElement;
import by.zvv.javaonline.part05.task05.builder.FlowerBuilder;
import by.zvv.javaonline.part05.task05.property.Color;
import by.zvv.javaonline.part05.task05.property.Size;

public class Flower implements CompositionElement{

	private final String name;
	private final Color color;
	private final Size size;
	private BigDecimal price;

	public Flower(String name, Color color, Size size, BigDecimal price) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.price = price;
	}
	
	public Flower(FlowerBuilder builder) {
		this.name = builder.getName();
		this.color = builder.getColor();
		this.size = builder.getSize();
		this.price = builder.getPrice();
	}

	public String getName() {
		return name;
	}

	public Color getColor() {
		return color;
	}

	public Size getSize() {
		return size;
	}

	@Override
	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String getElementName() {
		StringBuilder sb = new StringBuilder();
		sb.append(name).append(" ");
		if (!(color == null))
			sb.append(color).append(" ");
		if (!(size == null))
			sb.append(size).append(" ");
		return sb.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, name, price, size);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Flower other = (Flower) obj;
		return color == other.color && Objects.equals(name, other.name) && Objects.equals(price, other.price)
				&& size == other.size;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getClass().getSimpleName());
		builder.append(" [color=");
		builder.append(color);
		builder.append(", size=");
		builder.append(size);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}

}
