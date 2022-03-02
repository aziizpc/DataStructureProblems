package String;

import java.util.Arrays;

public class SortLettersAlphabetically {

	public static void main(String[] args) {

		String s = "rdgf kjk lkia ii kyuu han qlkzo";

		// char[] sCharArray = s.toCharArray();
		String[] sStringArray = s.split(" ");

		char[] sEachArray = null;
		for (int i = 0; i < sStringArray.length; i++) {
			String sEach = sStringArray[i];
			sEachArray = sEach.toCharArray();
			Arrays.sort(sEachArray);
			for (char c : sEachArray) {
				System.out.print(c);
			}
			System.out.println("");
		}

	}
}