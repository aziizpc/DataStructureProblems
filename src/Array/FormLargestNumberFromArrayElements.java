package Array;

import java.util.Arrays;
import java.util.Collections;

public class FormLargestNumberFromArrayElements {

	public static void main(String[] args) {

		int num[] = {1, 2, 3, 0, 4, 6};		
		
		Arrays.sort(num);
		
		Integer numInteger[] = {1, 2, 3, 0, 4, 6};
		Arrays.sort(numInteger, Collections.reverseOrder());  	// Array reversed
		
		String s = Arrays.toString(num).replaceAll("[^0-9]", "");
		String ss = Arrays.toString(numInteger).replaceAll("[^0-9]", "");
		
		String sb = new StringBuilder(s).reverse().toString();	// String reversed
		
		int number = Integer.parseInt(sb);
		Integer numberInteger = Integer.parseInt(ss);
		
		System.out.println(number);
		System.out.println("\n");
		System.out.println(numberInteger);

	}

}