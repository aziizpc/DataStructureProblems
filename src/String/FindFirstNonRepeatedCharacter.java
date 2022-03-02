package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindFirstNonRepeatedCharacter {

	public static void main(String[] args) {

		String s = "aabbdef";
		
		System.out.println("Map:"); 
		Map<Character, Integer> myMap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			myMap.put(c, myMap.getOrDefault(c, 0) + 1);
			System.out.println(myMap);
		}

		System.out.println("\nFirst Non Repeated Character:");
		for (Map.Entry<Character, Integer> myEntry : myMap.entrySet()) { // Iterate through HashMap using Entry
			if (myEntry.getValue() == 1) {
				System.out.print(myEntry.getKey()); // Print the key with max value
				break;
			}
		}
	}
}