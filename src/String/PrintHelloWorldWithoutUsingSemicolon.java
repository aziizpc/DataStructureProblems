package String;

public class PrintHelloWorldWithoutUsingSemicolon {

	public static void main(String[] args) {

		// Method 1:
		if (System.out.printf("Hello World") == null) { // printf - Used to output a formatted string to the console
														// using various format specifiers. (%d, etc...)

		}

		System.out.println("\n------------------------------");

		// Method 2:
		if (System.out.append("Hello World") == null) {

		}

		System.out.println("\n------------------------------");

		// Method 3:
		if (System.out.append("Hello World").equals(null)) {

		}

		System.out.println("\n------------------------------");

		// Method 4:
		if (System.out.append("Hello World").equals(null)) {

		}

		System.out.println("\n------------------------------");

		// Method 5:
		for (int i = 0; i < 1; System.out.println("Hello World")) {	// ; used
			i++;
		}

	}

}