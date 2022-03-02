package String;

public class StringManipulation {

	public static void main(String[] args) {

		String s = "The rains have started here selenium";

		System.out.println("Length of the string: " + s.length()); // Not .size()

		System.out.println("Value at index 5: " + s.charAt(5));

		System.out.println("Index of s: " + s.indexOf('s'));

		System.out.println("Second occurence of s: " + s.indexOf('s', s.indexOf('s') + 1)); // s.indexOf("s") + 1 = 9
																							// ==> Start from 9

		System.out.println(s.indexOf('s'));
		System.out.println(s.indexOf('s', s.indexOf('s') + 1));
		System.out.println();

		System.out.println("Third occurrencr of s: " + s.indexOf('s', s.indexOf('s', s.indexOf('s') + 1) + 1)); // Add
																												// fn in
																												// place
																												// of +1

		System.out.println("Index of have: " + s.indexOf("have"));

		System.out.println("Index of hello: " + s.indexOf("hello")); // Returns -1 as hello not present

		String x = "Hello";
		String y = "World";
		int a = 100;
		int b = 200;
		System.out.println(x + y + a + b);
		System.out.println(a + b + x + y);
		System.out.println(x + y + (a + b));
	}

}