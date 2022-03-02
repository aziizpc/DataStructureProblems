// If there is decimal in the numerator or denominator, then no ArithmeticException
// % 0 always NaN

package Number;

public class DivideByZero {

	public static void main(String[] args) {
		// System.out.println(9 / 0); //ArithmeticException
		// System.out.println(0 / 0); //ArithmeticException

		// Gives "Infinity":
		System.out.println(9.0 / 0); // float (Note)
		System.out.println(12.33f / 0); // float (Note)
		System.out.println(10 / 0.0);
		System.out.println(14.99999d / 0); // double (Note)
		System.out.println(12.88f / 0.0); // float
		System.out.println(19.55 / 0.0);
		System.out.println('A' / 0.0);

		// Gives NaN:
		System.out.println(0.0 / 0);	//All zeros and its decimals ==> NaN
		System.out.println(0 / 0.0);
		System.out.println(0.0 / 0.0);

		System.out.println(3.9 % 0); // %
		System.out.println(3.944f % 0);
		System.out.println(4.1 % 0.0);
		System.out.println(0.0 % 0);
		System.out.println(0 % 0.0);

	}
}