package String;

public class SwapTwoStrings {

	public static void main(String[] args) {

		String x = "Hello";
		String y = "Universe";

		System.out.println("x: " + x + "\ny: " + y);

		x = x + y;
		System.out.println("x: " + x);
		y = x.substring(0, x.length() - y.length()); // y is x now
		System.out.println("y: " + y);
		x = x.substring(y.length()); // Note this (last0
		System.out.println("x: " + x);

		System.out.println("------------------------------------------");
		System.out.println("x: " + x + "\ny: " + y);
	}

}