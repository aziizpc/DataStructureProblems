package Number;

public class ReverseANumber {

	public static void main(String[] args) {

		int num = 12345;
		System.out.println("Number: " + num + "\n");

		int reverse = 0;
		while (num > 0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;
			System.out.println(reverse + " " + num);
		}

		System.out.println("\nReversed Number: " + reverse);
	}
}