package Number;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num = 153;
		int rem = 0;
		int calc = 0;

		int temp = num;

		while (num > 0) {
			rem = num % 10;
			calc = calc + (rem * rem * rem);
			num = num / 10;
		}

		System.out.println("Calculated value: " + calc);
		if (calc == temp) {
			System.out.println("The number is armstrong");
		} else {
			System.out.println("The number is not armstrong");
		}
	}
}