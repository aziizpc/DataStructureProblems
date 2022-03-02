package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteAnElementFromArray {

	public static String deleteFromFront(Integer[] myArray, int num) {
		System.out.println("Before deletion: " + Arrays.toString(myArray));

		List<Integer> myList = new ArrayList<>(Arrays.asList(myArray));
		myList.remove(0);

		myArray = myList.toArray(myArray); // Updated myArray

		return Arrays.toString(myArray); // null values in o/p as Array size is fixed
	}

	public static String deleteFromEnd(Integer[] myArray, int num) {
		System.out.println("Before deletion: " + Arrays.toString(myArray));

		ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(myArray));
		myList.remove(myList.size() - 1); // Note : last element
		myArray = myList.toArray(myArray);

		return Arrays.toString(myArray);
	}

	public static String deleteFromGivenPosition(Integer[] myArray, int num, int pos) {
		System.out.println("Before deletion: " + Arrays.toString(myArray));

		ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(myArray));
		myList.remove(pos - 1);
		myArray = myList.toArray(myArray);

		return Arrays.toString(myArray);

	}

	public static void main(String[] args) {

		Integer[] myArray1 = { 9, 6, 4, 90, 34 }; // Note: Integer[]
		Integer[] myArray2 = { 9, 6, 4, 90, 34 }; // Note: Integer[]
		Integer[] myArray3 = { 9, 6, 4, 90, 34 }; // Note: Integer[]

		int num = 31;
		int pos = 3;

		System.out.println("String Operations\n------------------");
		System.out.println("Delete from front: " + DeleteAnElementFromArray.deleteFromFront(myArray1, num));
		System.out.println("------------------------------------");
		System.out.println("Delete from end: " + DeleteAnElementFromArray.deleteFromEnd(myArray2, num));
		System.out.println("------------------------------------");
		System.out
				.println("Delete from given position: " + DeleteAnElementFromArray.deleteFromGivenPosition(myArray3, num, pos));

		// null values in o/p as Array size is fixed
	}
}