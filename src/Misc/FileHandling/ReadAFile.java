package Misc.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAFile {

	public static void main(String[] args) {

		String path = "C:\\Users\\aapc\\Downloads\\FileHandle\\sample.text";

		File myFile = new File(path);

		FileInputStream myFileInputStream = null;

		try {
			myFileInputStream = new FileInputStream(myFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		int i;

		try {
			while ((i = myFileInputStream.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}