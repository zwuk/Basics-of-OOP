package by.zvv.javaonline.part05.task05.builder;

import java.math.BigDecimal;

import by.zvv.javaonline.part05.task05.entity.Flower;
import by.zvv.javaonline.part05.task05.property.Color;
import by.zvv.javaonline.part05.task05.property.Size;

public class FlowerBuilder {
	
	private String name;
	private Color color;
	private Size size;
	private BigDecimal price;
	
	public FlowerBuilder(String name) {
		if(name == null || name == "")
			throw new IllegalArgumentException("У цветка должно быть название");
		this.name = name;
	}
	
	public FlowerBuilder withColor(Color color) {
		this.color = color;
		return this;
	}
	
	public FlowerBuilder withSize(Size size) {
		this.size = size;
		return this;
	}
	
	public FlowerBuilder withPrice(BigDecimal price) {
		this.price = price;
		return this;
	}
	
	public Flower build() {
		return new Flower(this); 
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

	public BigDecimal getPrice() {
		return price;
	}
	
	
}
