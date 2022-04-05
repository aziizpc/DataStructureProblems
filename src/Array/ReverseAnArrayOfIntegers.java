package Array;

import java.util.Arrays;

public class ReverseAnArrayOfIntegers {

	public static void main(String[] args) {

		int num[] = { 8, 6, 10, 15, 109, 23, 0, 1, -67, 44, 77 };

		int numfinal[] = new int[num.length];
		int count = 0;

		for (int i = num.length - 1; i >= 0; i--) {
			numfinal[count] = num[i];
			count++;
		}
		System.out.println(Arrays.toString(numfinal));

		num = numfinal;

		System.out.println(Arrays.toString(num));

		System.out.println("\n------------------------------------------------------------\n");

		System.out.println("Original array: " + Arrays.toString(num));	// Method 2 --> Follow this
		for (int i = 0; i < num.length / 2; i++) {
			int temp = num[i];
			num[i] = num[num.length - i - 1];
			num[num.length - i - 1] = temp;
		}
		System.out.println("Reverse array : " + Arrays.toString(num));
	}

}