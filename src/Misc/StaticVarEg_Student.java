package Misc;

public class StaticVarEg_Student {
	
	int rollno;// instance variable
	String name;
	static String college = "ITS";	// static variable 	// Common for all Students.
	
	// constructor
	StaticVarEg_Student(int r, String n){  
	   rollno = r;  
	   name = n;  
	   }

	// method to display the values
	void display() {
		System.out.println(rollno + " " + name + " " + college); // Note: college is static
	}
}