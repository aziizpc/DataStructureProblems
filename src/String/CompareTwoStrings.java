package String;

import java.util.Scanner;

public class CompareTwoStrings {

	public static void main(String args[]) {
		String str1 = null;
		String str2 = null;

		Scanner myScan = new Scanner(System.in); // To accept String from user

		System.out.print("Enter String 1: ");
		str1 = myScan.nextLine();

		System.out.print("Enter String 2: ");
		str2 = myScan.nextLine();

		// Compare strings
		if (str1.length() != str2.length()) {
			System.out.println("Strings are not same, lengths are different !!!");
			myScan.close();
			return;
		}

		boolean flag = true;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				flag = false;
				break;
			}
		}

		if (flag) {
			System.out.println("Strings are same.");
		} else {
			System.out.println("Strings are not same.");
		}
		myScan.close();
	}
}