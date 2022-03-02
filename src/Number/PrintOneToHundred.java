// Print without using any number

package Number;

public class PrintOneToHundred {

	static int i = 'A' / 'A'; // For Method 3 // Value of i will be retained after each pass 

	public static void main(String[] args) {

//		// Method 1:
//		int one = 'A' / 'A'; // This gives 1
		String s1 = "!!!!!!!!!!"; // Length of the string = 10
//		for (int i = one; i <= (s1.length() * s1.length()); i++) {
//			System.out.println(i);
//		}
//
//		// Method 2:
//		one = 'A' / 'A';
//		for (int i = one; i <= 'd'; i += one) { // ASCII values --> a: 97 ; b: 98; c: 99; d: 100
//			System.out.println(i);
//		}

		// Method 3: No loop as well
		s1 = "!!!!!!!!!!";
		if (i <= (s1.length() * s1.length())) {
			System.out.printf("%d", i++); // printf (Used to output a formatted string to the console using various
											// format specifiers.)
			System.out.println("");
			main(null);	// Value of i is coming from outside main function :)
		}
	}
}