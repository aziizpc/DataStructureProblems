package Number;

public class ReverseANumberRecursion {
	
	static int reverse = 0;
	
	public static int reverse (int num) {
		
		if (num < 10) {
			reverse = reverse * 10 + num;
			System.out.print(reverse);
			return reverse;	// Simply
		}
		else {
			reverse = reverse * 10 + num % 10;
			return reverse (num / 10);
		}		
	}

	public static void main(String[] args) {
		
		int num = 6654654;		
		reverse(num);
		
	}
}