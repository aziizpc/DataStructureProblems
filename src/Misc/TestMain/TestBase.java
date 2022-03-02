// JVM will search for PSVM

package Misc.TestMain;

public class TestBase {

	public static void main(String[] args) {
		System.out.println("Main method 1");
		main("Testing");
		main(10);
		main(44, 90);
	}

	public static void main(int a) {
		System.out.println("Main method 2");
	}

	public static void main(int a, int b) {
		System.out.println("Main method 3");
	}
	
	public static void main(String args) {
		System.out.println("Main method 4");
	}

}
