package by.zvv.javaonline.part05.task05.main;

import java.math.BigDecimal;

import by.zvv.javaonline.part05.task05.builder.FlowerBuilder;
import by.zvv.javaonline.part05.task05.entity.Bouquet;
import by.zvv.javaonline.part05.task05.entity.Flower;
import by.zvv.javaonline.part05.task05.entity.Package;
import by.zvv.javaonline.part05.task05.logic.FlowerShopAction;
import by.zvv.javaonline.part05.task05.property.Color;
import by.zvv.javaonline.part05.task05.property.Size;

/* Задача 5.
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * • Корректно спроектируйте и реализуйте предметную область задачи.
 * • Для создания объектов из иерархии классов продумайте возможность использования 
 * порождающих шаблонов проектирования.
 * • Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
 * • для проверки корректности переданных данных можно применить регулярные выражения.
 * • Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
 * • Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
 * 
 * Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
 * (объект, представляющий собой цветочную композицию). 
 * Составляющими цветочной композиции являются цветы и упаковка.
 */

public class Runner {

	public static void main(String[] args) {

		FlowerShopAction flowerShop = new FlowerShopAction();

		// Создание номенклатуры - цветы
		Flower flower = new FlowerBuilder("Роза")
				.withColor(Color.BURGUNDY)
				.withSize(Size.MEDIUM)
				.withPrice(new BigDecimal(2.50))
				.build();
		Flower flower2 = new FlowerBuilder("Роза")
				.withColor(Color.PINK)
				.withSize(Size.MEDIUM)
				.withPrice(new BigDecimal(2.50))
				.build();
		Flower flower3 = new FlowerBuilder("Хризантема")
				.withColor(Color.WHITE)
				.withSize(Size.BIG)
				.withPrice(new BigDecimal(1.00))
				.build();

		// Создание номенклатуры - упаковка
		Package basket = new Package("Корзина ", new BigDecimal(10.00));
		Package box = new Package("Коробка ", new BigDecimal(3.70));
		Package paper = new Package("Декоративная бумага ", new BigDecimal(0.30));
		
		Bouquet bouquet = flowerShop.createComposition();
		
		bouquet.addElementToComposition(flower, 2);
		bouquet.addElementToComposition(flower2, 3);
		bouquet.addElementToComposition(flower3, 11);
		bouquet.addElementToComposition(flower3, 8);
		bouquet.addElementToComposition(basket, 1);
		bouquet.addElementToComposition(paper, 1);
		
//		bouquet.removeElementFromComposition(flower3);

		flowerShop.showBouquetComposition("Состав цветочной композиции:", bouquet);
		flowerShop.getCostBouquetComposition("Стоимость цветочной композиции: ", bouquet);

	}

}
