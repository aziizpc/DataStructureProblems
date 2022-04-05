package String;

public class StringToNumber {

	public static int convert_String_To_Number(String numStr) {
		char ch[] = numStr.toCharArray();	// To Char Array
		int sum = 0;
		// Get ASCII value of 'character' zero
		int zeroAscii = (int) '0';
		//System.out.println("ASCII value of 0: " + zeroAscii + "\n");	// Ans: 48
		for (char c : ch) {
			int tempAscii = (int) c;	// Get ASCII value of current 'char'
			sum = (sum * 10) + (tempAscii - zeroAscii);	// Note
		}
		return sum;
	}

	public static void main(String a[]) {
		System.out.println("\"3256\" == " + convert_String_To_Number("3256"));
		System.out.println("\"76289\" == " + convert_String_To_Number("76289"));
		System.out.println("\"90087\" == " + convert_String_To_Number("90087"));
	}

}