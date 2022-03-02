package String;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class SplittingString {

	private static String REGEX = ":";					// For Pattern.compile()
	private static String INPUT = "hello:dear:guest";	// For Pattern.compile()

	public static void main(String[] arg) {

		// Using split method:

		System.out.println("Using Split Method: ");
		String s1 = "What are you doing today?";
		String split[] = s1.split(" ", 0); // 0 ==> Split at all occurrence of space. 2 ==> Split in to 2, 3 ==> 3, ...
		for (String s : split)
			System.out.println(s);

		// Using StringTokenizer:

		System.out.println("\nUsing StringTokenizer:");
		StringTokenizer s2 = new StringTokenizer("A StringTokenizer sample"); // Declared as StringTokenizer
		// get how many tokens are inside s2 object
		System.out.println("Tokens Count: " + s2.countTokens());

		// iterate st object to get more tokens from it
		while (s2.hasMoreElements()) {
			String token = s2.nextElement().toString(); // String = s -> Next Element -> To String
			System.out.println("Token: " + token);
		}

		// Using Pattern.compile ()

		System.out.println("\nUsing Pattern.compile():");
		Pattern pattern = Pattern.compile(REGEX);
		String[] result = pattern.split(INPUT);
		for (String data : result) {
			System.out.println(data);
		}
	}
}