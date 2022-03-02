package Array;

public class SumOfElementsInAnArray {

	public static void main(String[] args) {
		
		int myArray[] = new int[5];
		
		myArray[0] = 5;
		myArray[1] = 2;
		myArray[2] = 10;
		myArray[3] = 0;
		myArray[4] = 11;
		
		int sum = 0;
		
		for (int i = 0 ; i < myArray.length ; i++) {
			
			sum = sum + myArray[i];
			
		}
		
		System.out.println("Sum of elements in the array: " + sum);
		
	}	
	
}