package lv.alina.test;

import lv.alina.employee.CommissionEmployee;
import lv.alina.employee.SalaryEmployee;
import lv.alina.paysystem.PaymentSystem;

public class TestPaymentSystem {

	
	public static void main(String[] args) {
		PaymentSystem paymentSystem = new PaymentSystem();
		CommissionEmployee toms = new CommissionEmployee("Toms Ozolins", 101010101, 5000.3);
		paymentSystem.addPayee(toms);
		CommissionEmployee ilze = new CommissionEmployee("Ilze Berzina", 202020202, 6000.4);
		paymentSystem.addPayee(ilze);
		SalaryEmployee janis = new SalaryEmployee("Janis Zarins", 303030303, 4500.22);
		paymentSystem.addPayee(janis);
		SalaryEmployee liene = new SalaryEmployee("Liene Zemite", 404040404, 3000.7);
		paymentSystem.addPayee(liene);
		
		toms.giveCommission(50.0);
		liene.giveBonus(20.0);
		toms.giveCommission(150.0);
		ilze.giveCommission(150.0);
		toms.giveCommission(150.0);
		toms.giveBonus(13.4);
		ilze.giveCommission(300.0);
		janis.giveBonus(10.7);
		janis.giveBonus(17.3);
		
		paymentSystem.processPayments();
		
		paymentSystem.printName();
		
		Double d = 40.33333312;
		String s = String.valueOf(d);
		System.out.println(s);
		System.out.println(String.format("%1.2f", d));

	}

}