//TC = O(n)		SC = O(n)

package String;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKDistinctCharacters {

	public static void main(String[] args) {

		String s = "bccbababd";
		System.out.println("Given String: " + s + "\n");
		int k = 2;

		if (s == null || s.length() == 0 || k <= 0 || k > s.length()) {
			System.out.println("Failed");
		}

		int start = 0, end = 0;
		int maxLength = 0; // maxLength = end - start + 1
		Map<Character, Integer> myMap = new HashMap<>(); // Declared a HashMap

		for (int i = end; i < s.length(); i++) {
			char currentCharacter = s.charAt(end);
			myMap.put(currentCharacter, myMap.getOrDefault(currentCharacter, 0) + 1); // Here, we need to store the
																						// occurrence of each char. If
																						// not available, put 0. If
																						// already available, add 1.

			if (myMap.size() > k) {
				char characterFromFront = s.charAt(start);
				myMap.put(characterFromFront, myMap.get(characterFromFront) - 1); // Decreasing the count as we are
																					// moving 'start one step ahead

				if (myMap.get(characterFromFront) == 0) { // If count = 0 after decreasing, we are removing from Map
					myMap.remove(characterFromFront);
				}
				start++; // start incremented [Within while loop]
			}
			maxLength = Math.max(end - start + 1, maxLength); // The bigger of this would be set as maxLength (Why
																// comparing? --> To check if the latest substring is
																// longer than the last)

			System.out.println(
					"Map: " + myMap + "\t\t| Start : " + start + "| End : " + end + " | Maxlength: " + maxLength);
			end++; // end incremented
		}
		System.out.println("\nMax Length: " + maxLength);
	}
}

/**
b c c b a a b a b d
0 1 2 3 4 5 6 7 8 9

Character		Max	Start	End
b->1			1	0		0
c->1			2	0		1
c->1->2			3	0		2
b->1->2			4	0		3
a->1;b->1;c->0	2	3		4
a->2			3	3		5	
b->2			4	3		6
a->3			5	3		7
b->3			6	3		8	(Max)
d->1;b->1;a->0	2	8		9

**/