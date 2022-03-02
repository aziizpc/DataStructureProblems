package Number;

public class FibonacciSeries {

	public static void main(String[] args) {

		// 0 1 0+1=1 1+1=2 1+2=3 2+3=5 3+5=8

		int a = 0 , b = 1;
		int sum;
		int count = 20;

		System.out.println(a + "\n" + b);
		
		while (count > 0) {
			sum = a + b;
			System.out.println(sum);
			a = b;
			b = sum;
			count--;
		}
	}
}