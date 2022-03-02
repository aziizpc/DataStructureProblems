package String;

public class GetAllSubstrings {

	public static void main(String[] args) {

		String s = "abcdefg";

		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j <= s.length(); j++) { 	// Note: j = i also TRUE | Note: <=
				System.out.println(s.substring(i, j));	// Create Substring based on start and end given
			}
		}
	}
}