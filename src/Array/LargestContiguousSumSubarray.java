package Array;

public class LargestContiguousSumSubarray {

	public int calculateFunction(int myArray[]) {

		int maxSoFar, currentMax;
		maxSoFar = currentMax = myArray[0];

		for (int i = 0; i < myArray.length; i++) {
			currentMax = Math.max(myArray[i], currentMax + myArray[i]);
			System.out.println("Current Max: " + currentMax);
			maxSoFar = Math.max(currentMax, maxSoFar);
			System.out.println("Max So Far: " + maxSoFar);
			System.out.println("---------------------------");
		}
		return maxSoFar;

	}

	public static void main(String[] args) {

		int myArray[] = { 3, -4, 4, -1, -2, 1, 5, -3 };

		LargestContiguousSumSubarray myObject = new LargestContiguousSumSubarray();

		System.out.println(myObject.calculateFunction(myArray));

	}
}