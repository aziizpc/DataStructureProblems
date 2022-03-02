// TC = O(n)	SC = O(n)

package String;

import java.util.HashSet;
import java.util.Set;

public class NumberOfUniqueCharacters {

	public static void main(String[] args) {

		String s = "rrdgfgfdfretrdggcgfdfdfffw";
		
		Set<Character> mySet = new HashSet<>();		// Declare a Set
		
		for (int i = 0 ; i < s.length(); i++) {
			mySet.add(s.charAt(i));
		}
		
		System.out.println("Size: " + mySet.size());		
	}
}