package Misc.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateANewFile {

	public static void main(String[] args) {

		String path = "C:\\Users\\aapc\\Downloads\\FileHandle\\sample.text"; // Full path WITH FILE NAME

		File myFile = new File(path);

		try {
			boolean flag = myFile.createNewFile(); // .createNewFile()
			if (flag) {
				System.out.println("File is created.");
			} else {
				System.out.println("File is already present.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		FileOutputStream fileOutputStream = null;

		try {
			fileOutputStream = new FileOutputStream(myFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		byte writeData[] = "Hello World 1234567 !!!".getBytes(); // Note .getBytes()

		try {
			fileOutputStream.write(writeData);
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {	// Optional
			if (fileOutputStream != null) { // Why !=
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}