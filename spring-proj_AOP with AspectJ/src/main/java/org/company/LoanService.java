package org.company;

public class LoanService{
	
	public LoanService(){
		
	}
	
	public void issueLoan(String customerId) {
		System.out.println("Loan Issued! : "+ customerId);
	}

	public void clearDue(String customerId) {
		System.out.println("Pending Due Cleared! : "+ customerId);
	}
}
