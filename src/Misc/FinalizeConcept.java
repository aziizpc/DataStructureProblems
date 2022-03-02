// Used for cleanup processing before garbage collection

package Misc;

public class FinalizeConcept {

	public void finalize() {
		System.out.println("Finalize method");
	}

	public static void main(String[] args) {

		FinalizeConcept myObject1 = new FinalizeConcept();
		FinalizeConcept myObject2 = new FinalizeConcept();

		myObject1 = null;		
		myObject2 = null;

		System.gc(); // Garbage Collection
		System.gc(); // No impact
		
		System.out.println("Test");
	}
}