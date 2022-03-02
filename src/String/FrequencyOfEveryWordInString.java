package String;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEveryWordInString {

	public static void main(String[] args) {

		String s = "Best items in category are Samsung, Lenovo. Samsung items are nice. Lenovo are cool";
		System.out.println("String: " + s);

		s = s.replaceAll("[^a-zA-Z0-9]", " "); // Whatever the char apart from a-zA-Z0-9, replace with space. ^ ==> NOT.
		System.out.println("\nReplaced String: " + s);

		System.out.println("\nAll Words: ");
		String[] allWords = s.split(" +"); // Split with space (One or more). There could be more than one space as
											// special char would already be replaced with space.
		for (int i = 0; i < allWords.length; i++) {
			System.out.print(allWords[i] + " "); // Just printing the words :)
		}

		Map<String, Integer> countingMap = new HashMap<>(); // Declared a Map

		for (String word : allWords) { // Looping the Map
			word = word.toLowerCase(); // Converted all to lower case. This can even be outside the for loop.
			countingMap.put(word, countingMap.getOrDefault(word, 0) + 1); // getOrDefault function
		}

		System.out.println("\n\nFrequency: " + countingMap);
	}
}