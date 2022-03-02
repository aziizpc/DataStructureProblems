package A;

import java.util.HashMap;
import java.util.Map;

public class FreshworksTwoArray {

	public static void findSumArray(int numberArray[], int sum) {
		for (int i = 0; i < numberArray.length; i++) {
			for (int j = i + 1; j < numberArray.length; j++) {
				if (numberArray[i] + numberArray[j] == sum) {
					System.out.println("A pair found: " + numberArray[i] + " -- " + numberArray[j]);
				}
				//else
			}
		}
		//System.out.println("Pair not found!");
	}
	
	public static void findSumArray1(int numberArray[], int sum) {
		Map<Integer, Integer> myMap = new HashMap<>();
		for (int i = 0 ; i < numberArray.length ; i++) {
			if (myMap.containsKey(sum - numberArray[i])) {
				System.out.println("1. " + (sum - numberArray[i]) + " 2. " + numberArray[i]);
			}
			myMap.put(numberArray[i], i);
		}
		
	}
	

	public static void main(String[] args) {

		int[] numberArray = { 1, 2, 3, 4, 5, 6 };
		int sum = 6;
		findSumArray(numberArray, sum);
		findSumArray1(numberArray, sum);

	}
}