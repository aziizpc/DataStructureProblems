// How can we run java program without creating an object? Ans: static block and static class

package Misc;

public class StaticBlockQuestions_2 {

	static {
		System.out.println("Static block");
	}

	public static void test() {
		System.out.println("Testing method");
	}

	public static void cover() {
		System.out.println("Cover method");
		test(); // OR StaticBlockQuestions_2.test();
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		test(); // OR StaticBlockQuestions_2.test();
		cover();
	}

}