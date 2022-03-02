package Number;

public class FactorialOfANumber {

	public static void main(String[] args) {

		int num = 8;
		int factorial = 1;

		// Non - Recursive function method:
		if (num == 0) {
			System.out.println("Factorial: 1");
			return;
		}

		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
			System.out.println("Factorial: " + factorial);
		}
		System.out.println("Factorial of 8: " + factorial(8));
	}

	// Recursive function method:
	public static int factorial(int num) {
		if (num == 0) {
			return 1; // Important
		} else {
			System.out.println("\nnum: " + num);
			return (num * factorial(num - 1)); // When factorial(num - 1) becomes 0, it returns 1 ==> num * 1.
												// Multiplication action in one go.
		}
	}
}