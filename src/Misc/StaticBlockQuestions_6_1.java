// What will be the o/p

package Misc;

public class StaticBlockQuestions_6_1 {

	public static void main(String[] args) {

		System.out.println(StaticBlockQuestions_6.x);	// static block NOT executed for this
		
		System.out.println("-------------------------");
		
		System.out.println(new StaticBlockQuestions_6().y); // static block executed for this (As y is not static)
		
	}
}

// 1. static block will NOT be executed here. Why? Compiler optimization. --> System.out.println(StaticBlockQuestions_6.x); ==> System.out.println(20);