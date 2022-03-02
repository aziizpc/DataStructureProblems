package String;

public class CheckIfStringContainsOnlyDigits {

	public static void main(String[] args) {
		String s1 = "56564657657";
		String s2 = "Hello World 16666 TYYYG";
		String s3 = "76686898798Hello World";

		CheckIfStringContainsOnlyDigits myObject = new CheckIfStringContainsOnlyDigits();
		System.out.println(myObject.checkIfOnlyDigits(s1));
		System.out.println(myObject.checkIfOnlyDigits(s2));
		System.out.println(myObject.checkIfOnlyDigits(s3));
	}

	public String checkIfOnlyDigits(String s) {
		// if (s.equals(s.replaceAll("[^\\d.]", ""))) {
		if (s.equals(s.replaceAll("[^0-9.]", "?"))) {
			return "The String " + s + " contains only digits.";
		} else {
			return "The String " + s + " contains non-digits.";
		}
	}
}