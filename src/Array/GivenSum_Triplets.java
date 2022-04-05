package Array;

import java.util.Arrays;

public class GivenSum_Triplets {

	// function to print
	// triplets with given sum
	static void findTriplets(int[] arr, int n, int sum) {
		// sort array elements
		Arrays.sort(arr);

		for (int i = 0; i < n - 1; i++) {
			int x = arr[i];
			// initialize left and right
			int l = i + 1;
			int r = n - 1;
			while (l < r) {
				if (x + arr[l] + arr[r] == sum) {
					// print elements if its
					// sum is given sum.
					System.out.println(x + " " + arr[l] + " " + arr[r]);
					l++;
					r--;
				}

				// If sum of three elements
				// is less than 'sum' then
				// increment in left
				else if (x + arr[l] + arr[r] < sum)
					l++;

				// if sum is greater than
				// given sum, then decrement
				// in right side
				else
					r--;
			}
		}
	}

	// Driver code
	public static void main(String args[]) {
		int[] arr = new int[] { 0, -1, 2, -3, 1 };
		int sum = -2;
		int n = arr.length;
		findTriplets(arr, n, sum);
	}
}