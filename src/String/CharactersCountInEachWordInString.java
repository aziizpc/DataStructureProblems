//Note: In Map, characters are not coming in the order of that in the string. Why?

package String;

import java.util.HashMap;
import java.util.Map;

public class CharactersCountInEachWordInString {

	public static void main(String[] args) {

		String s = "Onn Mathiyakki Vere Enthelum Panikk Podo";
		String[] stringArray = s.split(" ");
				
		
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
			String str = stringArray[i]; // Take one word at a time
			Map <Character, Integer> myMap = new HashMap<>();	// Note: Map is declared here :)
			for (int j = 0 ; j < str.length() ; j ++) {
				char c = str.charAt(j);
				myMap.put(c, myMap.getOrDefault(c, 0) + 1);
				//System.out.println(myMap);				
			}
			System.out.println(myMap + "\n");
		}
		//System.out.println(myMap);
	}
}