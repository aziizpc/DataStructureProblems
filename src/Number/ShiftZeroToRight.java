// Array will be loaded with zeros by default

package Number;

import java.util.Arrays;

public class ShiftZeroToRight {

	public static void shiftZeroToRight(int[] array) {

		int b[] = new int[array.length];
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				System.out.println("Non-zero element: " + array[i]);
				b[count] = array[i];
				count++;
			}
		}
		System.out.println("\n" + Arrays.toString(b));	// REMEMBER
		System.out.println("----------------------------------------------------\n");
	}

	public static void main(String[] args) {

		int a[] = new int[] { 5, 0, 2, 0, 3, 0, 0, 0 }; // O/P: 1 2 3 0 0 0 0 0
		shiftZeroToRight(a);
		int c[] = new int[] { 5 };
		shiftZeroToRight(c);

	}

}