package String;

public class PrintNumberOfVowelsWordsCharacters {

	public static void main(String[] args) {

		String s = "dgdgtigfd66464 64aqwetoi mnbvxcz khjjhh fffsduyuyrt re97876)(*&^ %$#@!)(&^$ $@$%^% %&^&";

		int vowelsCount = 0, wordCount = 1, charCount = 0;
		// var nospecial = "/^[^*|\":<>[\]{}`\\()';@&$]+$/";

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowelsCount++;
			}
			if (c == ' ') {
				wordCount++;
			}
			if (c == '~' || c == '!' || c == '@' || c == '#' || c == '$' || c == '%' || c == '^' || c == '&' || c == '*'
					|| c == '(' || c == ')' || c == '+' || c == '-' || c == '?' || c == ',') {
				charCount++;
			}

		}

		System.out.println("Number of Vowels: " + vowelsCount + "\nNumber of Words: " + wordCount
				+ "\nNumber of Characters: " + charCount);
	}
}