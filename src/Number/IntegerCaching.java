// Integer caching will happen only between -128 and 127

package Number;

public class IntegerCaching {

	public static void main(String[] args) {

		Integer num1 = 100;
		Integer num2 = 100;
		
		if (num1 == num2) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Both are NOT equal");
		}
		
		num1 = 128;
		num2 = 128;
		
		if (num1 == num2) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Both are NOT equal");
		}
		

	}

}
