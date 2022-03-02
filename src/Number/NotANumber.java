package Number;

public class NotANumber {

	public static void main(String[] args) {

		System.out.println(0.0 / 0.0);
		System.out.println(Math.sqrt(-1));
		System.out.println(3.9 % 0);

		System.out.println("------------------------");

		System.out.println(Float.NaN); // NaN
		System.out.println(Float.NaN == Float.NaN); // false (One NaN will never be equal to another NaN)
		System.out.println(Float.NaN != Float.NaN); // true

		System.out.println("------------------------");

		double nan = 2.1 % 0; // NaN
		System.out.println(2.1 % 0 == nan); // false  // NaN at a time will never be equal to another

		System.out.println("------------------------");

		nan = 3.7 % 0;
		System.out.println(nan == nan); // false	// (")

	}

}