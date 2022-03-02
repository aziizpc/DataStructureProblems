package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LengthOfStringWithoutUsingLengthMethod {

	public static void main(String[] args) {

		String s = "Testing";

		// Solution 1:
		System.out.println("Length: " + s.toCharArray().length);
		
		// Solution 2:
		System.out.println("Length: " + s.split("").length);	// .split returns array

		// Solution 3:
		System.out.println("Length: " + s.lastIndexOf("")); // Last index of nothing

		// Solution 4:
		Matcher m = Pattern.compile("$").matcher(s);
		m.find();
		System.out.println("Length: " + m.end());
		
		// Solution 5:
		int count = 0;
		for (char myChar : s.toCharArray()) {
			count++;
		}
		System.out.println("Length: " + count);

	}

}
