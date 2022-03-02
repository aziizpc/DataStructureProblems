package Array;

public class SearchAValueInArray {

	public int searchIndex(int myArray[], int num) {

		if (myArray.length == 0) {
			return -1;
		}

		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] == num) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int myArray[] = { 5, 90, 1, 3, 66, 3, 0 };

		SearchAValueInArray myObj = new SearchAValueInArray();	// Object created

		int i = myObj.searchIndex(myArray, 66);	// Object.FunctionName

		if (i == -1) {
			System.out.println("Value not found");
		} else {
			System.out.println("Value found at " + (i+1) + " position");
		}

	}

}