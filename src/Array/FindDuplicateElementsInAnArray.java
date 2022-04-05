package Array;

import java.util.HashSet;

public class FindDuplicateElementsInAnArray {

	public static void main(String[] args) {

		int num[] = { 5, 8, 90, 96, 4, 1, 5, 6, 5, 11, 88, 11, 5, 90 };

		// Method 1:
		boolean flag1 = false;

		for (int i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println("Duplicate element: " + num[i]);
					flag1 = true;
					break;
				}
			}
		}
		if (flag1 == false) {
			System.out.println("Duplicate element not found");
		}

		// Method 2:
		System.out.println("\n");
		HashSet<Integer> myHashSet = new HashSet<>();	// HashSet cannot have duplicate

		boolean flag2 = false;

		for (int number : num) {
			if (myHashSet.add(number) == false) {
				System.out.println("Duplicate element: " + number);
				flag2 = true;
			}
		}

		if (flag2 == false) {
			System.out.println("Duplicate element not found");
		}

	}
}