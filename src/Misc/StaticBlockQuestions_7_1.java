package Misc;

public class StaticBlockQuestions_7_1 {

	static {
		System.out.println("static block"); // 1
	}

	{
		System.out.println("instance initialization block"); // 3
	}

	StaticBlockQuestions_7_1() {
		System.out.println("constructor"); // 4
	}

	public static void main(String[] args) {

		System.out.println("main method"); // 2
		new StaticBlockQuestions_7_1(); // ----------> Object created <------------

	}

}
