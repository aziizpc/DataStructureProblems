package Number;

public class SumOfDigitsInANumber {

	public static void main(String[] args) {

		int num = 4654654;
		int remainder, sum = 0;

		while (num > 0) {
			remainder = num % 10;
			System.out.println("\nRemainder: " + remainder);
			sum = remainder + sum;
			System.out.println("Current Sum: " + sum);
			num = num / 10;
			System.out.println("remaining Number: " + num);
		}		
		System.out.println("\nSum of digits: " + sum);
	}
}