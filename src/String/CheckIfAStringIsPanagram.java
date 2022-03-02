package String;

import java.util.HashMap;
import java.util.Map;

public class CheckIfAStringIsPanagram {

	public static void main(String[] args) {

		String s = "a quick brown fox jumps over the lazy dog1234";

		s = s.toLowerCase().replace(" ", "").replaceAll("[^a-z]", "");

		System.out.println("Array after formatting: " + s + "\n");

		Map<Character, Integer> myMap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			myMap.put(c, myMap.getOrDefault(c, 0) + 1);
		}
		if (myMap.size() == 26) {
			System.out.println("The string is panagram :)");
		} else {
			System.out.println("The string is not panagram :(");
		}
	}
}