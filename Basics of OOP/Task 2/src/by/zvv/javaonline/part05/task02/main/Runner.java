package by.zvv.javaonline.part05.task02.main;

import by.zvv.javaonline.part05.task02.bean.Payment;
import by.zvv.javaonline.part05.task02.bean.Payment.Product;
import by.zvv.javaonline.part05.task02.view.PaymentView;

public class Runner {

	public static void main(String[] args) {

		Payment newPayment = new Payment();
		PaymentView view = new PaymentView();
		
		newPayment.addProduct(new Product("Монитор", 320));
		newPayment.addProduct(new Product("Системный блок", 873));
		newPayment.addProduct(new Product("Мышь", 24));
		newPayment.addProduct(new Product("Клавиатура", 12));
		
		view.showInfoAboutPayment(newPayment);
	}

}
