package lv.alina.paysystem;

import java.util.ArrayList;
import java.util.List;

public class PaymentSystem {

	public List<Payee> payees;

	public PaymentSystem() {
		payees = new ArrayList<>();

	}

	public void addPayee(Payee payee) {
		if (!payees.contains(payee)) {
			payees.add(payee);
		}
	}

	public void processPayments() {
		for (Payee payee : payees) {
			Double grossPayment = payee.grossPayment();

			System.out.println("Pay to " + payee.name());
			System.out.println("Gross salary " + String.format("%1.2f", grossPayment));
			System.out.println("Transferred to Account No. " + payee.bankAccount());
		}
	}
		public void printName() {
			for (Payee payee : payees) {
				
				System.out.print(payee.name()+" ");
		
			}
	}

	@Override
	public String toString() {
		return "PaymentSystem [payees=" + payees + "]";
	}

}
