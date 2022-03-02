package Misc;

public class StaticBlockQuestions_3_1 {

	public static void main(String[] args) {

		// StaticBlockQuestions_3 myObj = new StaticBlockQuestions_3(); // This will
		// throw an error 'The constructor StaticBlockQuestions_3() is not visible' as
		// there is a private constructor in the StaticBlockQuestions_3 class.

		/** Solution 1: static block in StaticBlockQuestions_3
		 * 
		 * Solution 2: static method in StaticBlockQuestions_3
		 */
		
		// StaticBlockQuestions_3 myObj = new StaticBlockQuestions_3(); // Not possible as StaticBlockQuestions_3 constructor is private
		
		
		
		int i = StaticBlockQuestions_3.createObject();	// Solution 2
		System.out.println(i);
	
		
	}

}
