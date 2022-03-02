package String;

public class ReverseVowelsInGivenString {

	public static void main(String[] args) {

		String s = "equation"; // Vowel Order: euaio Expected o/p: oiaue
		System.out.println("Given String: " + s);

		String vowels = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowels = c + vowels;
			}
		}
		System.out.println("Reversed Vowels: " + vowels);
	}
}