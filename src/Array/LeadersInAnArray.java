// Self

package Array;

public class LeadersInAnArray {

	public static void main(String[] args) {

		int[] num = { 92, 8, 7, 12, 0, 9, 72, 5, 8, 3 };

		int count = 0;
		int sub = 1;

		System.out.println("Leaders in the array: ");
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					count++;
				}
			} // Exists after each iteration
			if (count == (num.length - sub)) {
				System.out.print(num[i] + " ");
			}
			sub++;
			count = 0;
		}
	}
}