package String;

public class CountNumberOfDuplicateWordsInGivenString {

	public static void main(String[] args) {

		String s = "Apple Mango Tree Salt Dog Apple Tree Hello World Mango";

		s = s.toLowerCase();

		String myArray[] = s.split(" ");

		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}

		int count = 0;

		for (int i = 0; i < myArray.length; i++) {
			for (int j = i + 1; j < myArray.length; j++) {
				if (myArray[i].equals(myArray[j])) { // Note this
					System.out.println("Duplicate Word: " + myArray[i]);
					count = count + 1;
					System.out.println("Count: " + count);
				}
			}
		}

	}

}