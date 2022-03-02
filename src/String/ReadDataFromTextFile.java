package String;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {

		// Method 1: FilReader & BufferedReader
		FileReader myFileReader = new FileReader("C:\\Users\\aapc\\Desktop\\D.txt");
		BufferedReader myBufferedReader = new BufferedReader(myFileReader);

		String str;

		while ((str = myBufferedReader.readLine()) != null) { // Make a note of this = !=
			System.out.println(str);
		}
		myBufferedReader.close();

		// Method 2: File & Scanner  -- Easy
		File myFile = new File("C:\\Users\\aapc\\Desktop\\D.txt");
		Scanner myScanner = new Scanner(myFile);

		while (myScanner.hasNextLine()) {
			System.out.println(myScanner.nextLine());
		}
		myScanner.close();
	}
}