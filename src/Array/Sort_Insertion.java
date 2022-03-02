// Code same as insertion of an element in a sorted array
// Here, we insert elements at its right position one after the other
package Array;

import java.util.Arrays;

public class Sort_Insertion {

	public static void main(String[] args) {

		int myArray[] = { 6, 0, -1, 9, 3 };
		System.out.println("Array before sorting: " + Arrays.toString(myArray));

		for (int i = 1; i < myArray.length; i++) {

			int temp = myArray[i]; // First vale from unsorted
			int questionMark = i - 1; // Sorted first (From right)

			while (questionMark >= 0 && myArray[questionMark] > temp) { // R -> L movement  && 'temp' is lesser
				myArray[questionMark + 1] = myArray[questionMark]; // Move to right
				questionMark--; // Decrement (As we are going from R -> L in sorted portion)
			}
			myArray[questionMark + 1] = temp; // Save value in place of ?
		}
		System.out.println("Array after sorting: " + Arrays.toString(myArray));
	}
}

/**
 * 0 1 2 3 4 - - - - - 6 0 -1 9 3
 * 
 * 6 | 0 -1 9 3 6 | ? -1 9 3 key = 0 ; ? = 1 ? | 6 -1 9 3 0 6 | -1 9 3
 * 
 * 0 6 | -1 9 3 0 6 | ? 9 3 key = -1 ; ? = 2 0 ? | 6 9 3 ? 0 | 6 9 3 -1 0 6 | 9
 * 3
 * 
 * 
 **/