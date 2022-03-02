// Simplest

package Array;

import java.util.Arrays;

public class Sort_Selection {

	public static void main(String[] args) {

		int myArray[] = { 9, -1, 3, 0, 11, 2, 5 };

		int min = myArray[0];
		
		for (int i = 0; i < myArray.length; i++) {
			for (int j = i; j < myArray.length; j++) {
				if (myArray[i] < min) {
					min = myArray[i];
				}
				//myArray[i] = min;
			}
		}
		System.out.println(Arrays.toString(myArray));

	}

}