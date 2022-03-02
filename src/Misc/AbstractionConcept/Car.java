package Misc.AbstractionConcept;

public interface Car {

	// Define only abstract methods --> No body | Only declaration
	// 100% abstraction
	// Cannot create object of interface (Like abstract)
	// Can have only final and static variables
	
	int wheels = 4;	// This will be automatically set as final	

	public void start(); // No abstract keyword here

	public void stop();

	public void refuel();

}