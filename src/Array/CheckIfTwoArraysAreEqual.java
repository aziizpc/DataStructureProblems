package Array;

import java.util.Arrays;

public class CheckIfTwoArraysAreEqual {

	public static void main(String[] args) {

		int myArray1[] = { 9, 6, 2, 3, 19, 17, 8 };
		int myArray2[] = { 9, 6, 2, 3, 19, 17, 8 };
		// int myArray2[] = {19, 17, 8, 9, 3, 2, 6};

		boolean status = Arrays.equals(myArray1, myArray2); // Both the array has same elements in the same position ==>
															// TRUE

		if (status) {
			System.out.println("The arrays are equal");
		} else {
			System.out.println("The arrays are NOT equal");
		}
	}
}