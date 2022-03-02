package String;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GetCharactersInDescendingOrderOfFrequency {

	// function to sort hashmap by values
	public static Map<Character, Integer> sortByValue(Map<Character, Integer> myMap) {
		// Create a list from elements of Map
		List<Map.Entry<Character, Integer>> myList = new LinkedList<Map.Entry<Character, Integer>>(myMap.entrySet());

		// Sort the list using lambda expression
		Collections.sort(myList, (i1, i2) -> i2.getValue().compareTo(i1.getValue())); // Note: i1 , i2 for decreasing
																						// order

		// Put data from sorted list to Map
		Map<Character, Integer> temp = new LinkedHashMap<Character, Integer>(); // Note: LinkedHashMap
		for (Map.Entry<Character, Integer> myEntry : myList) {
			temp.put(myEntry.getKey(), myEntry.getValue());
		}
		return temp;
	}

	public static void main(String[] args) {
		String s = "banana is a fruit";
		Map<Character, Integer> myMap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			myMap.put(c, myMap.getOrDefault(c, 0) + 1);
		}
		System.out.println("All Characters: " + myMap + "\n");

		Map<Character, Integer> sortedMap = sortByValue(myMap); // Calling the function

		// Print the sorted Map
		System.out.println("Sorted Map: " + sortedMap + "\n");

		// Print the sorted Map in correct format
		System.out.println("Sorted Map:");
		for (Map.Entry<Character, Integer> myEntry : sortedMap.entrySet()) {
			System.out.println("Key = " + myEntry.getKey() + ", Value = " + myEntry.getValue());
		}

	}
}