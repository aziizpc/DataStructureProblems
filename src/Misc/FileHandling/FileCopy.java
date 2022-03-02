// FileInputStream --> Read | FileOutputStream --> Write

package Misc.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void copyFile() {

		File file = new File("C:\\Users\\aapc\\Downloads\\JavaTest.pdf");
		File opFile = new File("C:\\Users\\aapc\\Downloads\\JavaTestCopy.pdf");

		FileInputStream fileInputStream = null; // Simply set to null, else these two will become local to the below try
												// block
		FileOutputStream fileOutputStream = null;

		try {
			fileInputStream = new FileInputStream(file); // Set fileInputStream
			fileOutputStream = new FileOutputStream(opFile); // Set fileOutputStream
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			System.out.println(fileInputStream.available()); // Just to print the number of bytes (Optional)
		} catch (IOException e) {
			e.printStackTrace();
		}

		int i = 0;

		try {
			while ((i = fileInputStream.read()) != -1) { // ( i = fileInputStream.read() ) != -1 (Main part)
				// System.out.print((char) i);
				fileOutputStream.write(i); // Just write
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally { // finally block (Optional)
			if (fileInputStream != null) { // Why !=
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fileOutputStream != null) { // Why !=
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static void main(String[] args) {

		copyFile();

	}

}