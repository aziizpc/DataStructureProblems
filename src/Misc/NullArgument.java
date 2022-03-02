package Misc;

public class NullArgument {

	public static void main(String[] args) {
		test(null);
	}

	public static void test(Object o) {
		System.out.println("Object Argument");
	}

	public static void test(String s) {
		System.out.println("String Argument"); // This one would be having the preference although String is a child
												// class of Object
	}

//	public static void test(StringBuilder s) {
//		System.out.println("StringBuilder Argument");	// If uncommented, test(null) gives error.
//	}
//
//	public static void test(StringBuffer s) {
//		System.out.println("StringBuffer Argument");	// If uncommented, test(null) gives error.
//	}

}