package Misc;

public class StarPattern_1 {

	public static void main(String[] srgs) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");	// For next line
		}

		System.out.println("-------------------------");

		for (int i = 5; i > 0; i--) { // Reverse order
			for (int j = 0; j < i; j++) { // = removed
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("-------------------------");
		
		
	}
}