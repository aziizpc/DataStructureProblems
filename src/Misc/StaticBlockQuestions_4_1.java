package Misc;

public class StaticBlockQuestions_4_1 {

	public static void main(String[] args) {

		StaticBlockQuestions_4 myObj = new StaticBlockQuestions_4();	// 1 -- static blocks will be executed
		
		System.out.println(StaticBlockQuestions_4.age);	// 2 -- age will be printed

	}

}