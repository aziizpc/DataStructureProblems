package Misc;

public class StaticVarEg_Student_1 {
	
	public static void main(String args[]) {
		StaticVarEg_Student s1 = new StaticVarEg_Student(111, "Karan");
		StaticVarEg_Student s2 = new StaticVarEg_Student(222, "Aryan");
		// we can change the college of all objects by the single line of code
		// StaticVarEg_Student.college="BBDIT";
		s1.display();
		s2.display();
	}
}