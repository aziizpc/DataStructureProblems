package String;

public class TrimTheString {

	public static void main(String[] args) {
		String s = "          Aarum     !!!      Pedikkanda      Ellavarum      Oodikkoo                     ";
		System.out.println(s);

		char[] array = s.toCharArray();
		int start = 0, end = array.length - 1, count;

		for (int i = 0; i < array.length; i++) { // Forward
			if (array[i] != ' ') {
				start = i;
				break;
			}
		}

		for (int i = array.length - 1; i >= 0; i--) { // Backward
			if (array[i] != ' ') {
				end = i;
				break;
			}
		}

		for (int i = start; i <= end; i++) { // Print (Method 1)
			System.out.print(array[i]);
		}

		count = end - start + 1; // Print (Method 2)
		String resultString = new String(array, start, count); // Note this
		System.out.println("\n" + resultString);
	}
}