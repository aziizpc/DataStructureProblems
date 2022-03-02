// finally block will be executed always. Doesn't matter Exception is coming or not.

package Misc;

public class FinallyConcept {

	public static void main(String[] args) {
		test1();
		test2();
		division1();
		division2();
	}

	public static void test1() {
		System.out.println("test1() :::");
		try {
			System.out.println("Inside test1 method");
			throw new RuntimeException("Test"); // Throws Exception
		} catch (Exception e) {
			System.out.println("Inside catch block");
		} finally {
			System.out.println("Inside finally block");
		}
	}

	public static void test2() {
		System.out.println("\ntest2() :::");
		try {
			System.out.println("Inside test2");
		} finally {
			System.out.println("Code in test2 method");
		}
	}

	public static void division1() {
		System.out.println("\ndivision1() :::");
		int i = 10;
		try {
			System.out.println("Inside try block");
			int k = i / 0;
		} catch (ArithmeticException e) {
			System.out.println("Inside catch block");
			System.out.println("Divide by zero error");
		} finally {
			System.out.println("This block would be executed");
		}
	}

	public static void division2() {
		System.out.println("\ndivision2() :::");
		int i = 10;
		try {
			System.out.println("Inside try block");
			int k = i / 0;
		} catch (NullPointerException e) { // NullPointerException in place of Arithmetic
			System.out.println("This block will NOT be executed");
		} finally {
			System.out.println("This block would be executed");
		}
	}
}