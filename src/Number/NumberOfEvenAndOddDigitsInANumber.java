package Number;

public class NumberOfEvenAndOddDigitsInANumber {

	public static void main(String[] args) {

		int num = 12340;

		int oddCount = 0;
		int evenCount = 0;

		while (num > 0) {
			int remainder;
			remainder = num % 10;
			System.out.println("\nRemainder: " + remainder);
			if (remainder % 2 == 0) {
				evenCount++;
				System.out.println("Even Counter: " + evenCount);
			} else {
				oddCount++;
				System.out.println("Odd Counter: " + oddCount);
			}
			num = num / 10;
		}

		System.out.println("\nEven Digits Count: " + evenCount + "\nOdd Digits Count: " + oddCount);
	}
}