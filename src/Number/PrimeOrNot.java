package Number;

public class PrimeOrNot {

	public static void main(String[] args) {

		int num = 29;
		boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) { // Note: num / 2
			// condition for nonprime number
			System.out.println("i: " + i);
			if (num % i == 0) {
				System.out.println(num + " % " + i);
				flag = true;
				break; // break is important
			}
		}

		if (!flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}
}