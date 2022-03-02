package Array;

public class FindMissingNumber {

	public static void main(String[] args) {

		int myArray[] = { 1, 2, 3, 5, 6 };
		int sum1 = 0, sum2 = 0;

		for (int i = 0; i < myArray.length; i++) {
			sum1 = sum1 + myArray[i];
			System.out.println(sum1);
		}

		System.out.println("\n");
		for (int i = 1; i <= myArray.length + 1; i++) { // Start from 1 ; <= Array Size + 1
			sum2 = sum2 + i;
			System.out.println(sum2);
		}

		int difference = sum2 - sum1;

		System.out.println("\nMissing Number: " + difference);
	}
}