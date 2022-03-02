package Number;

public class NumberOfDigitsInANumber {

	public static void main(String[] args) {

		int num = 6565664;

		int count = 0;

		while (num > 0) {
			num = num / 10;
			System.out.println("Number: " + num);
			count++;
		}

		System.out.println("\nNumber of digits: " + count);

	}
}