package String;

public class ReplaceTheCharacter {

	public static void main(String[] args) {

		String s = "Aana Alaraloodalaral Enth Cheyyaan";

		char[] array = s.toCharArray();

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 'A' || array[i] == 'a') {
				array[i] = 'P';
			}
		}

		System.out.println(array);

	}
}