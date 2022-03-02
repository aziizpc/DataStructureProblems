package Misc;

public class ExecutingCommentsInJava {

	public static void main(String[] args) {

		// Hi this is my Java code (' \u000d
		System.out.println("Hello Azeez");
		System.out.println("Java");

		int value = 10;
		// \u000d
		value = 50;
		System.out.println(value);

		System.out.println(); // This is carriage return in Unicode character	
		System.out.println("Hello Programming");

	}

}