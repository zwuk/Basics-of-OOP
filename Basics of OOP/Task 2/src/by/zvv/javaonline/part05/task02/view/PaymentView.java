package by.zvv.javaonline.part05.task02.view;

import by.zvv.javaonline.part05.task02.bean.Payment;
import by.zvv.javaonline.part05.task02.bean.Payment.Product;
import by.zvv.javaonline.part05.task02.logic.PaymentAction;

public class PaymentView {
	
	PaymentAction action = new PaymentAction();

	public void showInfoAboutPayment(Payment payment) {
		System.out.println("Отчет о покупке");
		for(Product prod : payment.getProductList()) {
			System.out.println(prod.getName() + ", цена = " + prod.getPrice());
		}
		System.out.println("Приобретено " + payment.getProductList().size() + " позиции(й) на общую сумму = " + action.paymentCost(payment));
	}
}
