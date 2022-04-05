package Number;

public class BinaryOrNot {

	public static void checkBinary(int num) {		// VOID

		boolean flag = true;

		while (num != 0) {
			int rem = num % 10;
			if (rem > 1) {		// NOTE
				System.out.print(rem);
				flag = false;
				break;
			} else {
				num = num / 10;
			}
		}

		if (flag == true) {
			System.out.println("The number is binary");
		} else {
			System.out.println("The number is not binary");
		}
	}

	public static void main(String[] args) {
		int num1 = 76876876;
		checkBinary(num1);
		int num2 = 1110010110;
		checkBinary(num2);
	}

}