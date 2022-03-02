package Misc;

public class ByteCharIntLong {

	public static void main(String[] args) {

		int i = (byte) +(char) -(int) +(long) -1; // O/P --> 1	// b+c-i+l-1
		System.out.println(i);

		System.out.println("\n----------\n");

		System.out.println(+(long) -1);
		System.out.println(-(int) +(long) -1);
		System.out.println(+(char) -(int) +(long) -1);
		System.out.println((byte) +(char) -(int) +(long) -1);
	}

}