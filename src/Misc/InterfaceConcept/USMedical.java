package Misc.InterfaceConcept;

public interface USMedical extends WHO {	// Interface extends Interface

	int med_fee = 1000; // static and final by default

	public void physioServices(); // This is an abstract method (Although there is no k/w)

	public void oncologyServices();

	public void orthopedicServices();

	// static Methods with method body are allowed in Interface
	// New feature introduced with JDK 1.8
	public static void services_911() {
		System.out.println("911 Services");
	}

	// default CANNOT be static (We CANNOT use static k/w with default)
	default void internship() {
		System.out.println("Internship Services");
	}
}