package Array;

import java.util.Arrays;

public class GivenSum_Pairs {

	static void pairedElements(int arr[], int n, int sum) {
		Arrays.sort(arr);
		int l = 0;
		int r = n - 1;

		// No for loop
		while (l < r) {
			if (arr[l] + arr[r] == sum) {
				System.out.println("The pair is : (" + arr[l] + ", " + arr[r] + ")");
				l++;
				r--;
			} else if (arr[l] + arr[r] < sum) {
				l++;
			} else {
				r--;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, -2, 6, 8, 9, 11 };
		int sum = 6;
		int n = arr.length;
		pairedElements(arr, n, sum);
	}
}