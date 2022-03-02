package Misc.InterfaceConcept;

public class ApolloHospitals extends GlobalPatientData implements USMedical, UKMedical, IndianMedical {	// extends should come first

	@Override
	public void physioServices() {
		System.out.println("Apollo --- Physio");

	}

	@Override
	public void oncologyServices() {
		System.out.println("Apollo --- Onco");

	}

	@Override
	public void orthopedicServices() {
		System.out.println("Apollo --- Ortho");

	}

	@Override
	public void ENTServices() {
		System.out.println("Apollo --- ENT");

	}

	@Override
	public void ambulanceSevices() {
		System.out.println("Apollo --- Ambulance");

	}

	@Override
	public void emergencyServices() {
		System.out.println("Apollo --- Emergency");

	}

	@Override
	public void neuroServices() {
		System.out.println("Apollo --- Neuro");

	}

	@Override
	public void pediatricServices() {
		System.out.println("Apollo --- Pedia");

	}

	// Non-overridden methods
	public void OPTServices() {
		System.out.println("Apollo --- OPT");
	}

	public void medicalInsurance() {
		System.out.println("Apollo --- Insurance");
	}

	public void pathology() {
		System.out.println("Apollo --- Pathology");
	}

	@Override
	public void polioServices() {		// This method is from WHO interface
		System.out.println("Polio Services");
	}
	
	//public void internship() {			// We can override the default method (IMPORTANT)
	//	System.out.println("Apollo Internship");
	//}

}
