package A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import String.GetAllSubstrings;

public class TestFreshWorks {

	public static List<Character> createSet(String s) {
		Set<Character> mySet = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			mySet.add(c);
		}
		List<Character> sortedList = new ArrayList<>(mySet); // Converted Set to List as we want to sort
		Collections.sort(sortedList);
		return sortedList;
	}

	public static List<String> getAllSubstrings(String s) {
		List<String> allSubstrings = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				allSubstrings.add(s.substring(i, j));
			}
		}
		return allSubstrings;
	}

	public static String compareStrings(List<Character> sortedList, List<String> allSubstrings) {
		String mySetString = sortedList.toString().replaceAll("[^a-z]", "");
		System.out.println("Set: " + mySetString);
		String allSubStringsString = allSubstrings.toString().replaceAll("[^a-z,]", "");
		String[] allSubStringsArray = allSubStringsString.split(",");
		System.out.println("Substrings: " + Arrays.toString(allSubStringsArray));
		for (int i = 0; i < allSubStringsArray.length; i++) {
			char[] eachCharArray = allSubStringsArray[i].toCharArray();
			String eachCharString = Arrays.toString(eachCharArray);
			Arrays.sort(eachCharArray);
			// System.out.println("Each: " + Arrays.toString(eachCharArray));
			if (mySetString.equals(Arrays.toString(eachCharArray).replaceAll("[^a-z]", ""))) {
				return eachCharString;
			}
		}

		System.out.println(mySetString);
		System.out.println(allSubStringsString);

		return null;

	}

	public static void main(String[] args) {

		String s = "aabcbcdbca"; // dbca

		List<Character> sortedList = createSet(s);
		List<String> allSubstrings = getAllSubstrings(s);

		String result = compareStrings(sortedList, allSubstrings);
		System.out.println("Result: " + result.replaceAll("[^a-z]", ""));

	}
}