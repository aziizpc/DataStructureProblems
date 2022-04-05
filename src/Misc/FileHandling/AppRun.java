package Misc.FileHandling;

import java.io.IOException;

public class AppRun {

	public static void main(String[] args) throws IOException, InterruptedException {

		Runtime runTime = Runtime.getRuntime();
		//runTime.exec("Notepad.exe");	// Just opens Notepad
		Process pr = runTime.exec("Notepad.exe C:\\Users\\aapc\\Downloads\\Test.txt");	// Opens this file in Notepad		
		Thread.sleep(5000);		
		pr.destroy();
		
		String s[] = new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\Chrome.exe", "https://www.amazon.in"};
		runTime.exec(s);
	}

}