package org.company;

public class CreditCardService {
	
	public void issueCreditCard(String customerId) {
		System.out.println("Credit Card Issued! : " + customerId);
	}
	
	public void blockCreditCard(String customerId) {
		System.out.println("Credit Card Blocked! : " + customerId);
	}

	public void payDue(String customerId) {
			System.out.println("Pay Credit Card Due for customer : " + customerId);
	}
}
