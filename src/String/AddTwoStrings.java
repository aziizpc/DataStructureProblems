package String;

public class AddTwoStrings {

	public static void main(String[] args) {

		String s1 = "1111";
		String s2 = "2222";

		int s1Number = Integer.parseInt(s1);
		int s2Number = Integer.parseInt(s2);
		
		int sum = s1Number + s2Number;

		System.out.println("Sum of " + s1 + " and " + s2 + " is " + sum);

	}

}