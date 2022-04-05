package Misc.FileHandling;

import java.io.File;

public class SettingPermissions {

	public static void main(String[] args) {
		
		File file = new File ("C:\\Users\\aapc\\Downloads\\Test.txt");
		
		file.setExecutable(false);
		file.setReadable(false);
		file.setWritable(false);
		
		System.out.println("Done :)");

	}

}
