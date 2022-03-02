package String;

public class CheckBothStringsAreRotationOfEachOther {

	public static void main(String[] args) {

		String s1 = "abcd";
		String s2 = "dabc";

		String tempString = s1 + s1;
		System.out.println("Temp String: " + tempString);

		if (s1.length() == s2.length()) {
			if (tempString.contains(s2)) {
				System.out.println("Both the strings are rotation of each other");
			} else {
				System.out.println("Both the strings are NOT rotation of each other");
			}
		} else {
			System.out.println("Both the strings are NOT rotation of each other");
		}
	}
}