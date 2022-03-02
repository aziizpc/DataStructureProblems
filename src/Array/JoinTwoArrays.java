package Array;

import java.util.Arrays;
import java.util.stream.Stream;

public class JoinTwoArrays {

	public static void main(String[] args) {

		String myArray1[] = { "Poda", "Poyi", "vere", "valla", "work", "nokkedaaa" };

		String myArray2[] = { "enje", "Kond", "Onnum", "pattillaaa" };

		Stream<String> streamOfmyArray1 = Arrays.stream(myArray1); // Convert Array to Stream (No 'To.')

		Stream<String> streamOfmyArray2 = Arrays.stream(myArray2);

		String myArray[] = Stream.concat(streamOfmyArray1, streamOfmyArray2)
				.toArray(myCombinedSize -> new String[myCombinedSize]); // Combine the Streams and convert to Array

		for (String s : myArray) {
			System.out.print(s + " ");
		}

	}

}