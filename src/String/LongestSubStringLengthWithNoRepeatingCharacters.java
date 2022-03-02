//TC = O(n) 	|	SC = O(n)

package String;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringLengthWithNoRepeatingCharacters {

	public static void main(String[] args) {

		String s = "babccbacd";

		int start = 0, end = 0;
		int maxLength = 0;

		Map<Character, Integer> myMap = new HashMap<>(); // Declared a HashMap

		for (int i = end; i < s.length(); i++) {

			char currentChar = s.charAt(i);

			if (myMap.containsKey(currentChar)) { // Check if the Map already has the key
				start = Math.max(start, myMap.get(currentChar) + 1); // Here, we need to store index of each char. If
																		// yes, start = max(start, map.get(char)+1) -->
																		// See table in OneNote.
			}

			myMap.put(currentChar, end); // Add the character to Map. End will be the index. See table in OneNote.
			System.out.println("Map " + i + ": " + myMap);

			maxLength = Math.max(end - start + 1, maxLength);
			end++;
		}
		System.out.println("\nMax - length: " + maxLength);
	}
}

/**
b c c b a a b a b d
0 1 2 3 4 5 6 7 8 9

Character	Max		Start	End
b			1		0		0
c			2		0		1
c			1		2		2	// c already occurred ==> increment start. Check again still -> c still there. Inc again.
b			2		2		3
a			3		2		4
a			1		5		5	// ""
b			2		5		6
a			2		6		7
b			2		7		8
d			3		7		9	// Max = 3. Max came last because the longest String abd is at last
**/