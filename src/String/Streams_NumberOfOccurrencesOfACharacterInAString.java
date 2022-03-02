package String;

public class Streams_NumberOfOccurrencesOfACharacterInAString {

	public static void main(String[] args) {

		String s = "Hello World";

		long count = s.chars().filter(e -> (char) e == 'o').count();		// O/P : Long	// No stream k/w

		System.out.println("Count of letter o: " + count);

		count = s.chars().filter(e -> (char) e == 'o' || e == 'l').count();
		
		System.out.println("Count of letter o & l: " + count);
		

	}

}