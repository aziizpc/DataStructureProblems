package String;

public class SubstringPresentOrNot {

	public static boolean isSubstring1(String main, String sub) {
		return main.matches("(.*)" + sub + "(.*)");		// matches	|	Regular expression === (.*) ==> Anything
	}

	public static boolean isSubstring2(String main, String sub) {
		return main.contains(sub);
	}
	
	public static boolean isSubstring3(String main, String sub) {
		return main.indexOf(sub) != -1;	// index != -1 ==> true | index = -1 ==> false
	}

	public static void main(String[] args) {

		System.out.println(isSubstring1("Poda enthelum poyi pani nokk", "lum po")); // true
		System.out.println(isSubstring1("Poda enthelum poyi pani nokk", null)); // false

		System.out.println(isSubstring2("Poda enthelum poyi pani nokk", "lum po")); // true
		// System.out.println(isSubstring2("Poda enthelum poyi pani nokk", null)); // NullPointerException
		
		System.out.println(isSubstring3("Poda enthelum poyi pani nokk", "lum po")); // true
		System.out.println(isSubstring3("Poda enthelum poyi pani nokk", null)); // NullPointerException	

	}

}