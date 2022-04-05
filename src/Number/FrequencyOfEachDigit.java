package Number;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachDigit {

	public static void main(String[] args) {

		int num1 = 221445482;
		BigInteger num2 = new BigInteger("676469084434546656454355698");

		String numString1 = String.valueOf(num1); 	// int: String.valueOf(num)
		String numString2 = num2.toString(); 		// BigInteger: num.toString()

		Map<Character, Integer> myMap1 = new HashMap<>();
		for (int i = 0; i < numString1.length(); i++) {
			char c = numString1.charAt(i);
			myMap1.put(c, myMap1.getOrDefault(c, 0) + 1);
		}
		System.out.println(myMap1);

		Map<Character, Integer> myMap2 = new HashMap<>();
		for (int i = 0; i < numString2.length(); i++) {
			char c = numString2.charAt(i);
			myMap2.put(c, myMap2.getOrDefault(c, 0) + 1);
		}
		System.out.println(myMap2);
	}
}