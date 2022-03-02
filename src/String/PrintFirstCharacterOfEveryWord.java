package String;

public class PrintFirstCharacterOfEveryWord {

	public static void main(String[] args) {
		String s = "Aarum Pedikkanda Ellavarum Oodikkoo Vegam";
		char array[] = s.toCharArray(); // Standrad Function

		System.out.println(array); // This prints the entire array. Each element is in one array
														// position.

		for (int i = 0; i < array.length; i++) {
			if (i == 0) { // To print first element
				System.out.println(array[i]);
			} else if (array[i - 1] == ' ') { // If the last character is space ..
				System.out.println(array[i]);
			}
		}
	}
}