package Misc;

public class StaticBlockQuestions_4 {
	
	static int age = 20;
	
	static {
		System.out.println("This block will be executed even without a main method. -- 1"); // At the time of class loading
	}
	
	static {
		System.out.println("This block will be executed even without a main method. -- 2"); // At the time of class loading
	}

}