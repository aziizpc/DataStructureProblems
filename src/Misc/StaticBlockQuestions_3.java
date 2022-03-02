package Misc;

public class StaticBlockQuestions_3 {

	int age;

	private StaticBlockQuestions_3() { // Note: private (This is the problem statement) How can
										// StaticBlockQuestions_3_1 access 'age'?
		age = 30; 						// private ==> Other classes cannot create an object for this class.
	}

	static { // Solution 1
		StaticBlockQuestions_3 myObj = new StaticBlockQuestions_3(); // Creating an object so that
																		// StaticBlockQuestions_3_1 can access 'age'		// HOW???
	}

	public static int createObject() { // Solution 2 // Creating an object so that StaticBlockQuestions_3_1 can access
										// 'age' when method called
		StaticBlockQuestions_3 myObj = new StaticBlockQuestions_3();
		myObj.age = 40;
		return myObj.age;
	}

	public static void main(String[] args) {
		StaticBlockQuestions_3 myObj = new StaticBlockQuestions_3();
		System.out.println(myObj.age);

	}

}