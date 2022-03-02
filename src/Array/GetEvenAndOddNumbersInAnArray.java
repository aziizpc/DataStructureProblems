package Array;

public class GetEvenAndOddNumbersInAnArray {

	public static void main(String[] args) {
		
		int myArray[] = {9, 6, 2, 3, 19, 17, 8};		
		
		System.out.println("Even Numbers in the array:");
		for (int i = 0 ; i < myArray.length ; i++) {
			if (myArray[i] % 2 == 0) {
				System.out.println(myArray[i]);
			}
		}
		
		System.out.println("\nOdd Numbers in the array:");
		for (int i = 0 ; i < myArray.length ; i++) {
			if (myArray[i] % 2 != 0) {
				System.out.println(myArray[i]);
			}
		}
		
	}
}