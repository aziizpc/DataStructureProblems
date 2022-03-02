package String;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToAFile {
	
	public static void main(String[] args) throws IOException {
		
		// FileWriter and BufferedWriter
		
		FileWriter myFileWriter = new FileWriter("C:\\Users\\aapc\\Desktop\\D.txt");
		BufferedWriter myBufferedWriter = new BufferedWriter(myFileWriter);
		
		myBufferedWriter.write("Poyi");
		myBufferedWriter.write("Enthelum");
		myBufferedWriter.write("Pani");
		myBufferedWriter.write("Nokkeda");
		
		System.out.println("Task completed");
		
		myBufferedWriter.close();
		
	}
}