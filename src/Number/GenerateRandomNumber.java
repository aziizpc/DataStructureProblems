package Number;

public class GenerateRandomNumber {

	public static void main(String args[]) {
		// Generating random numbers with no min and max
		System.out.println("1st Random Number: " + Math.random());
		System.out.println("2nd Random Number: " + Math.random());
		System.out.println("3rd Random Number: " + Math.random());
		System.out.println("4th Random Number: " + Math.random());

		System.out.println("\n");
		int min = 200;
		int max = 400;
		// Generate random double value from 200 to 400
		System.out.println("Random value of type double between " + min + " to " + max + ":");
		double a = Math.random() * (max - min + 1) + min;
		int aInt = (int) a;
		System.out.println(a);
		System.out.println(aInt);
		// Generate random int value from 200 to 400
		System.out.println("Random value of type int between " + min + " to " + max + ":");
		int b = (int) (Math.random() * (max - min + 1) + min);
		System.out.println(b);
	}

}