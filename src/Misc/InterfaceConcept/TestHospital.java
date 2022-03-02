package Misc.InterfaceConcept;

public class TestHospital {

	public static void main(String[] args) {

		// We cannot create object of Interface (Important)
		// USMedical us = new USMedical(); --> This is NOT possible

		// In INTERFACE, Static methods are NOT allowed. Why? --> We cannot override it.

		ApolloHospitals ap = new ApolloHospitals();
		ap.ambulanceSevices();
		ap.emergencyServices();
		ap.ENTServices();
		ap.oncologyServices();
		ap.pathology();

		// Top Casting --> Child class object can be referred by parent interface
		// reference variable

		USMedical us = new ApolloHospitals(); // This is possible
		us.oncologyServices(); // Possible as it's from USMedical Interface
		us.orthopedicServices(); // Possible as it's from USMedical Interface
		us.physioServices(); // Possible as it's from USMedical Interface
		// us.ENTServices(); // Methods from other interface NOT possible
		// us.medicalInsurance // Non-overridden methods from ApolloHospitals also NOT
		// possible

		// Down Casting --> NOT possible
		// Why?:
		// new USmedical(); --> This is IMPOSSIBLE (See the very first comment)

		// Interface vars ARE static and final by default
		System.out.println(ap.med_fee); // Warning
		System.out.println(us.med_fee); // Warning
		System.out.println(USMedical.med_fee); // No warning
		// USMedical.med_fee = 2000; // Not possible as med_fee is final 9and static) by
		// default

		// Calling the static method
		USMedical.services_911();

		// Calling default method
		ap.internship(); // Possible
		us.internship(); // Possible

		// IMPORTANT: If same method name declared in multiple interface, it's OK (Just
		// define only once in the class)

		
		// GlobalPatientData
		ap.getPatientHistory();	// Accessing the elemment from parent class of ApolloHospitals
	}

}