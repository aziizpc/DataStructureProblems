package Array;

import java.util.Arrays;
import java.util.OptionalDouble;

public class CalculateAverageOfArrayUsingSimpleLoopAndJava8 {

	public static void main(String[] args) {
		
		// Loop:

		int num[] = { 78, 9, 45, 33, 81, 38 };
		
		double total = 0;	// Both has to be double
		double average = 0;
		
		for (int i : num) {
			total = total + i;
			average = (total / (num.length));
		}
		System.out.println("Average: " + average);
		
		// Stream:
		OptionalDouble average_Stream = Arrays.stream(num).average();	// O/P as OptionalDouble
		
		System.out.println("Average: " + average_Stream.getAsDouble());	// .getAsDouble()

	}

}