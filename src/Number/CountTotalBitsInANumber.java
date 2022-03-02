package Number;

public class CountTotalBitsInANumber {

	public static int countBits(int n) {
		int count = 0;
		while (n != 0) {
			System.out.println(n);
			count++;
			System.out.println(count + "\n");
			n >>= 1; // Set n to itself shifted by one bit to the RIGHT
		}

		return count;
	}

	/* Driver program */
	public static void main(String[] arg) {
		int i = 65;
		System.out.print("Number of bits: " + countBits(i));
	}

}