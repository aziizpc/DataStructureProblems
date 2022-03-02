// O(nsquare) | This is a brute force method

package Array;

public class Sort_Bubble {

	public void bubbleSort(int myArray[]) {
		if (myArray.length == 0 || myArray.length == 1) {
			return;
		}

		for (int i = 0; i < myArray.length - 1; i++) { // myArray.length - 1 ==> We are doing in pairs
			for (int j = 0; j < myArray.length - 1 - i; j++) { // -i ==> At each iteration, the last element gets its
																// position
				// System.out.println(myArray[i] + " , " + myArray[j]);
				if (myArray[j] > myArray[j + 1]) { // Swap
					int x = myArray[j + 1];
					myArray[j + 1] = myArray[j];
					myArray[j] = x;
				}
			}
		}
	}

	public void printArray(int myArray[]) {
		// System.out.println(Arrays.toString(myArray));
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}
	}

	public static void main(String[] args) {

		int myArray[] = { 67, -20, 40, 1, 4, 0, 11, -1, 9, 8, 100 };
		// 0 1 2 3 4 5 6 7 8 9 10
		Sort_Bubble myObject = new Sort_Bubble();

		System.out.println("Array before sorting: ");
		myObject.printArray(myArray);
		myObject.bubbleSort(myArray);
		System.out.println("\n\nArray after sorting: ");
		myObject.printArray(myArray);
	}
}