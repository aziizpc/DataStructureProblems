package String;

public class ReverseWordsInGivenString {

	public static void main(String[] args) {

		String s = "Poda poyi enthelum pani nokk";
		System.out.println("Actual String: " + s);

		// char[] array = s.toCharArray();

		String reversedString = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			reversedString = c + reversedString;
		}
		System.out.println("Reversed String: " + reversedString);

		String reversedWords = "";	// Nothing at first
		String tempString = "";		// Nothing at first		

		for (int i = 0; i < reversedString.length(); i++) {
			char c = reversedString.charAt(i);
			if (c != ' ') {
				tempString = c + tempString;
				System.out.println("TEMP " + i + " " + tempString);
			}
			else {
				reversedWords = reversedWords + tempString + " ";
				System.out.println("RVS " + i + " " + reversedWords);
				tempString = "";	// Clearing tempString for next iteration
			}
		}
		reversedWords = reversedWords + tempString;
		System.out.println("\nFinal String: " + reversedWords);
	}
}