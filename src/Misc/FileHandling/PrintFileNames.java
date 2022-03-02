package Misc.FileHandling;

import java.io.File;
import java.util.Arrays;

public class PrintFileNames {

	public static void main(String[] args) {

		String path = "C:\\Users\\aapc\\Downloads";

		File myFile = new File(path);

		File downloadDir[] = myFile.listFiles();		// Note this (Returns array of files)

		Arrays.sort(downloadDir);

		for (File f : downloadDir) {
			if (f.isFile()) {
				System.out.println("File: " + f.getName());
			} else if (f.isDirectory()) {
				System.out.println("Directory: " + f.getName());
			}
			else {
				System.out.println("Not known: " + f.getName());
			}
		}

	}

}