package Misc.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxWordCountInATextFile {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\aapc\\Downloads\\Test.txt";
		
		File myFile = new File (path);
		
		FileInputStream myFileInputStream = null;
		
		try {
			myFileInputStream = new FileInputStream(myFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		int i;
		char c = 0;
		String s = "";
		
		try {
			while ((i = myFileInputStream.read()) != -1) {
				c = (char) i;
				s = s + c;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(s + "\n----------\n");
		
		String stringArray1[] = s.split("\n");
		String stringArray2[] = {};
		
		Map <String, Integer> myMap = new HashMap<>();
		for (String eachString : stringArray1) {
			stringArray2 = eachString.split("( +)");
			for (String eachStringSub : stringArray2) {
				myMap.put(eachStringSub, myMap.getOrDefault(eachStringSub, 0) + 1);
			}			
		}
		
		System.out.print(myMap + "\n--------\n");
		
		int maxValueInMap = (Collections.max(myMap.values()));
		for (Map.Entry<String, Integer> myEntry : myMap.entrySet()) {
			if (myEntry.getValue() == maxValueInMap) {
				System.out.println("Most repeated word: " + myEntry.getKey() + " - " + myEntry.getValue());
			}
		}

	}
}