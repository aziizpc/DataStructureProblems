package Misc;

public class NullConcept {

	static Object obj;
	static String str;
	static NullConcept nc;

	public static void main(String[] args) {

		// 1. Default value of any reference variable will be null
		System.out.println(obj + str + nc); // nullnullnull

		// 2. Wrapper class vs int
		// Integer i = null; // Integer is Wrapper Class | int is primitive datatype
		// int j = i; // Not allowed (Throws NullPointerException)

		// 3. instanceof
		Integer p = 10;
		Integer q = null;
		System.out.println(p instanceof Integer); // true
		System.out.println(q instanceof Integer); // false as q is pointing to null

		// 4. static vs non-static
		NullConcept obj = null; // ClassName<space>ObjectName = null
		// obj.send(); // This throws NullPointerException as NullConcept obj = null;
		obj.sum(); // IMPORTANT: static methods can be accessed by null references

		// 5. == and !=
		System.out.println(null == null); // true
		System.out.println(null != null); // false

		// 6. Possible samples
		String str = null;
		Integer i1 = null;
		Double d1 = null;
		String s1 = (String) null;
		System.out.println(s1); // null
		System.out.println(s1 + "Azeez"); // nullAzeez
		// System.out.println(s1.length()); // NullPointerException | (s1.function gives
		// Exception)
		// System.out.println(s1.charAt(0)); // NullPointerException | (s1.function
		// gives Exception)

		Integer i2 = (Integer) null;
		Double d2 = (Double) null;
	}

	public static void sum() {
		System.out.println("Sum ...");
	}

	public void send() {
		System.out.println("Send ...");
	}

}
