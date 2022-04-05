package Array;

import java.util.HashSet;

public class CommonElementsBetweenTwoStringArrays {

	public static void main(String[] args) {

		String myArray1[] = { "Apple", "Mango", "Dog", "Cat", "Piano", "Table", "Car" };
		String myArray2[] = { "Chair", "Piano", "Phone", "Clock", "Cat", "Apple" };
		
		HashSet <String> myHashSet = new HashSet<>();

		for (String s : myArray2) {
			myHashSet.add(s);	// Added second array to HashSet
		}
		
		System.out.println("Common Elements: ");
		for (String s : myArray1) {
			if (myHashSet.add(s) == false) {	// Trying to add elements in 1st to 2nd
				System.out.print(s + " ");
			}
		}
	}
}