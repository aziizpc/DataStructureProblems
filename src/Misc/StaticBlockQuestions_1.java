// static block can be anywhere in the class
// We can compile and run a java program without a main method using static block. (Just Create an object from another class and leave it -- StaticBlockQuestions_4).

package Misc;

public class StaticBlockQuestions_1 {

	static {
		System.out.println("This block will be executed even before the main method. -- 1"); // At the time of class
																								// loading
	}

	static {
		System.out.println("This block will be executed even before the main method. -- 2"); // At the time of class
																								// loading
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static {
		System.out.println("This block will be executed even before the main method. -- 3"); // At the time of class
																								// loading
	}

}