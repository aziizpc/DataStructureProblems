// Java will consider the values as int if no L is present
// Java will truncate the most significant int accordingly (Convert to binary and check).

package Number;

public class LongNumbers {

	public static void main(String[] args) {

		long longNumberWithoutL = 1000 * 60 * 60 * 24 * 365;

		System.out.println(longNumberWithoutL); // 1471228928 (This answer is different from what you get from
												// calculator - 31536000000).
												// 1471228928 is 32 bit and 31536000000 is 36 bit.
												// Convert to binary and remove first 4 bits.

		long longNumberWithL = 1000 * 60 * 60 * 24 * 365L;
		System.out.println(longNumberWithL);

	}

}