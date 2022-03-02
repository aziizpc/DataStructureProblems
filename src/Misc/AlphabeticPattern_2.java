package Misc;

public class AlphabeticPattern_2 {

	public static void main(String[] args) {
		
		int a = 65;

		for (int i = 0 ; i < 5 ; i++) {
			for (int j = 0 ; j <= i ; j++) {
				System.out.print(Character.toString(a + i));	// Note: a + i
			}
			System.out.println("");
		}

	}

}