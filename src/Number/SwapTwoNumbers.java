package Number;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int x = 9;
		int y = 2;

		System.out.println("x: " + x + "\ny: " + y);

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("x: " + x + "\ny: " + y);
		
		int a = 32;
		int b = 56;

		System.out.println("a: " + a + "\nb: " + b);

		a = a * b;
		b = a / b;
		a = a / b;

		System.out.println("a: " + a + "\nb: " + b);

	}

}