// For Double and Float -> MIN_VALUE is a POSITIVE NUMBER | Others -> NEGATIVE

package Number;

public class DoubleMinValue {

	public static void main(String[] args) {

		System.out.println(Double.MIN_VALUE); // (==>Least positive number) This is a positive number --> Double
		System.out.println(Float.MIN_VALUE);  // Positive
		System.out.println(Long.MIN_VALUE); // Negative
		System.out.println(Integer.MIN_VALUE); // Negative

		System.out.println(Math.min(Double.MIN_VALUE, 0.0d)); // Min of least +ve number and 0.0 (Positive 0 number). //
																// Ans: 0.0
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d)); // Ans: 0

		System.out.println(Math.min(Integer.MIN_VALUE, 0.0d)); // Obviously Integer.MIN_VALUE as it's -ve
		System.out.println(Math.min(Long.MIN_VALUE, 0.0d)); // Obviously Long.MIN_VALUE as it's -ve

		System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY)); // -Infinity

	}

}