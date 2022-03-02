package String;

public class ReverseTheGivenString {

	public static void main(String[] args) {
		String s = "Eneett onn evidelum poyi irikkedo";
		System.out.println(s);

		char[] array = s.toCharArray();

		int start = 0, end = array.length - 1;

		while (start < end) { // Method 1 (Swapping)
			char temp;
			temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}

		// String reversedStringArray = Arrays.toString(array);
		// System.out.println(reversedStringArray.replaceAll("[-+.^:,]",""));

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}

		StringBuilder sb = new StringBuilder(s); // Method 2
		sb = sb.reverse();
		System.out.println("\n" + sb);

		String finalString = ""; // Method 3
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			finalString = c + finalString;
		}
		System.out.println(finalString);
	}
}