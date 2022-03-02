package JavaFeatures;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamsConcept {

	public static void main(String[] args) { // Stream.of.filter.forEach

		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));

		Stream.of("Hello", "Java").map(e -> e + " World !!").forEach(e -> System.out.println(e));

		System.out.println("---------------------------------------------------------");

		// Optional Method:

		String s[] = new String[5];
		// System.out.println(s[2].length()); // This gives NullPointerException if s[2]
		// doesn't have any value

		// Optional Method 1:
		Optional<String> isNull1 = Optional.ofNullable(s[2]); // ofNullable(s[2])
		if (isNull1.isPresent()) { // isPresent
			System.out.println(s[2] + " " + s[2].length());
		} else {
			System.out.println("The value is not available."); // if no element in s[2], prints this string.
		}

		// Optional Method 2:
		s[2] = "Hello World";
		Optional<String> isNull2 = Optional.ofNullable(s[2]);
		isNull2.ifPresent(e -> System.out.println("Length of " + e + " = " + e.length())); // ifPresent

		System.out.println("---------------------------------------------------------");

	}
}