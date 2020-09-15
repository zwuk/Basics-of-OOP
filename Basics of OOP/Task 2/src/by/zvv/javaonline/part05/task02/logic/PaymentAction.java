package by.zvv.javaonline.part05.task02.logic;

import by.zvv.javaonline.part05.task02.bean.Payment;
import by.zvv.javaonline.part05.task02.bean.Payment.Product;

public class PaymentAction {
	
	public double paymentCost(Payment payment) {
		double totalCost = 0;

		for(Product prod : payment.getProductList()) {
			totalCost += prod.getPrice();
		}
		return totalCost;
	}
}
