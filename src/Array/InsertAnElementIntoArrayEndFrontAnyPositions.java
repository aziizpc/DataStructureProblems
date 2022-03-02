package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertAnElementIntoArrayEndFrontAnyPositions {

	private static void addElement(Integer[] myArray, int element, int position) {	// Note: Integer

		// Printing the original array
		System.out.println("Initial Array:\n" + Arrays.toString(myArray));

		// Converting array to ArrayList
		List<Integer> myList = new ArrayList<>(Arrays.asList(myArray));

		// Adding the element at position
		myList.add(position - 1, element);

		// Converting the list back to array
		myArray = myList.toArray(myArray);

		// Printing the updated array
		System.out.println(
				"\nArray with " + element + " inserted at position " + position + ":\n" + Arrays.toString(myArray));
	}

	// Drivers Method
	public static void main(String[] args) {
		// Sample array
		Integer[] myArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };	// Note Integer[]

		// Element to be inserted
		int element = 50;

		// Position to insert
		int position = 5;

		// Calling the function to insert
		addElement(myArray, element, position);
	}
}