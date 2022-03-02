// C = O(logn)	| 

package Array;

public class BinarySearch {

	public int searchArray(int myArray[], int num, int start, int end) {

		if (myArray.length == 0 || start > end) { // Note: start > end ==> Element doesn't exist in array
			// System.out.println("Test");
			return -1;
		}

		int mid = (start + end) / 2;

		if (num == myArray[mid]) {
			return mid;
		}

		if (num < myArray[mid]) {
			return searchArray(myArray, num, 0, mid - 1);
		} else {
			return searchArray(myArray, num, mid + 1, (myArray.length - 1));
		}
	}

	static public void main(String[] args) {

		int myArray[] = { 4, 16, 78, 81, 93, 99, 105, 190 }; // Array should already be sorted

		BinarySearch myObject = new BinarySearch();

		int num = 99;

		int pos = myObject.searchArray(myArray, num, 0, (myArray.length - 1));

		if (pos == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at " + (pos + 1) + " position");
		}

	}

}