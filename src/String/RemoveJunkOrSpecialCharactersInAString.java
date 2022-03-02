package String;

public class RemoveJunkOrSpecialCharactersInAString {

	public static void main(String[] args) {

		// Replacing only junk and special characters:

		String s1 = "*(*(*&^%$%$$@@!! 1’ jgjgejf wj	hjrh r	qjwh yyuwquy";

		s1 = s1.replaceAll("[^a-zA-Z0-9 ]", ""); // Note space in regex

		System.out.println(s1);

		// Replacing only space:

		String s2 = "*(*(*&^%$%$$@@!! 1’ jgjgejf wj	hjrh r	qjwh yyuwquy";

		s2 = s2.replaceAll("\\s", ""); // Note: \\s (This is when we use replaceAll)

		System.out.println(s2);

	}
}