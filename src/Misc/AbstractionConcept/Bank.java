// Abstraction - Hiding the implementation logic
// Abstract class is faster than Interface

package Misc.AbstractionConcept;

public abstract class Bank {	// If a class is abstract, at least one abstract method is mandatory
	
	int amt = 100;			// Normal OK
	final int rate = 10;	// final OK
	static int loanRate = 5;// static OK
	
	// PARTIAL ABSTRACTION --> Can have both
	
	public abstract void loan();	// No body for abstract method
	
	// Non-abstract method 1
	public void credit() {
		System.out.println("Hello");
	}
	
	// Non-abstract method 2
	public void debit() {
		System.out.println("World");
	}	

}