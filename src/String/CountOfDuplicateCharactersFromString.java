package String;

import java.util.HashMap;
import java.util.Map;

public class CountOfDuplicateCharactersFromString {

	public static void main(String[] args) {

		String s = "Helllooo, World ... phheeww !!";

		char myArray[] = s.toCharArray();

		Map<Character, Integer> myMap = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			// System.out.println(myArray[i]);
			char c = myArray[i];
			myMap.put(c, myMap.getOrDefault(c, 0) + 1);
		}

		System.out.println(myMap + "\n");

		System.out.println("Count of duplicate characters: ");
		
		for (Map.Entry<Character, Integer> myEntry : myMap.entrySet()) {
			if (myEntry.getValue() > 1) {
				System.out.println(myEntry.getKey() + "  " + myEntry.getValue());
			}
		}
	}
}