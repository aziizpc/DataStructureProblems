package Array;

import java.util.Arrays;
import java.util.Collections;

public class SortElementsInAnArrayUsingBuiltInMethods {

	public static void main(String[] args) {

		// Method 1:
		int num1[] = { 5, 8, 90, 96, 4, 1, 5, 6, 5, 11, 88, 11 };
		System.out.println("Array before sorting: " + Arrays.toString(num1));
		Arrays.parallelSort(num1);
		System.out.println("Array after sorting: " + Arrays.toString(num1));

		// Method 2:
		int num2[] = { 5, 8, 90, 96, 4, 1, 5, 6, 5, 11, 88, 11 };
		System.out.println("\nArray before sorting: " + Arrays.toString(num2));
		Arrays.sort(num2);
		System.out.println("Array after sorting: " + Arrays.toString(num2));

		// Method 3:
		Integer num3[] = { 5, 8, 90, 96, 4, 1, 5, 6, 5, 11, 88, 11 }; // Note: Integer and not int | int is a data type
																		// | Integer is a wrapper class
		System.out.println("\nArray before sorting: " + Arrays.toString(num3));
		Arrays.sort(num3, Collections.reverseOrder());
		System.out.println("Array after sorting: " + Arrays.toString(num3));

	}

}
