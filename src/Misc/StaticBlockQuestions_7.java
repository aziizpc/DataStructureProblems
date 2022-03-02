package Misc;

public class StaticBlockQuestions_7 {

	static {
		System.out.println("static block");
	}

	{
		System.out.println("instance initialization block"); // This will NOT be printed (As no obj created)
	}

	StaticBlockQuestions_7() {
		System.out.println("constructor"); // This will NOT be printed (As no obj created)
	}

	public static void main(String[] args) {

		System.out.println("main method");

	}

}

// Why? --> The two which are NOT printed need an object to be created. We are NOT creating an object here.