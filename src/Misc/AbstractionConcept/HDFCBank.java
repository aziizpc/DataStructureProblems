package Misc.AbstractionConcept;

public class HDFCBank extends Bank {	// Extends

	public void loan() {	// The body of the method is mandatory here (Overriding)
		System.out.println("HDFC Loan Method");
	}
	
	// The other 2 methods debit() and credit() can too be overridden
	
	public void funds() {
		System.out.println("Poda");
	}
	
}