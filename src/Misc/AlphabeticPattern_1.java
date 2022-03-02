package Misc;

public class AlphabeticPattern_1 {

	public static void main(String[] args) {
	int a = 65;

		for (int i = 0; i < 6; i++) {			// 0 1 2 3 4 5
			for (int j = 0; j <= i; j++) {		// 0 1 2 3 4 5
				System.out.print(Character.toString ((char) a+j));	// Converting ASCII to character
			}
			System.out.println("");
		}
	}
}