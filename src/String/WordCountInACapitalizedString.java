// A: 65, Z: 90		|		a: 97, z: 122

package String;

public class WordCountInACapitalizedString {

	public static void main(String[] args) {

		String s = "AccentureSolutionsPrivateLimitedHyderabad";

		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int c_ascii = (int) c;
			if (c_ascii >= 65 && c_ascii <= 90) {
				count++;
			}
		}
		System.out.println("Number of words: " + count);
	}
}