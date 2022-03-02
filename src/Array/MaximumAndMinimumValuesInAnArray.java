package Array;

public class MaximumAndMinimumValuesInAnArray {

	public static void main(String[] args) {

		int num[] = { 8, 6, 10, 15, 109, 23, 0, 1, -67, 44, 77 };

		int max = num[0];
		int min = num[0];

		for (int i = 0; i < num.length; i++) {

			if (num[i] > max) {
				max = num[i];
			} else if (num[i] < min) {
				min = num[i];
			}
		}
		System.out.println("Maximum: " + max);
		System.out.println("Minimum: " + min);
	}
}