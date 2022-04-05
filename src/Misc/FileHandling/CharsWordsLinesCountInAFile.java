// Self

package Misc.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class CharsWordsLinesCountInAFile {

	public static void main(String[] args) {

		String path = "C:\\Users\\aapc\\Downloads\\Test.txt";
		File myFile = new File(path);

		FileInputStream myFileInputStream = null;

		try {
			myFileInputStream = new FileInputStream(myFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		int i;
		char c = 0; // char init as 0 ==> No issue
		String s = "";
		int wordCount = 0;

		try {
			while ((i = myFileInputStream.read()) != -1) {
				c = (char) i;
				s = s + c;	// Appending char to String (Possible)
				// System.out.print(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(s);
		System.out.println("Number of chracters: " + s.length());

		String stringArray1[] = s.split("\n");

		System.out.println("Number of lines: " + stringArray1.length);

		String stringArray2[] = {};
		for (String eachString : stringArray1) {
			stringArray2 = eachString.split("( +)"); // Note
			wordCount = wordCount + stringArray2.length;
			// System.out.println(Arrays.toString(stringArray2));
		}

		System.out.println("Number of words: " + wordCount);

	}

}