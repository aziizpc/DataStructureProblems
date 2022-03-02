// We can initialize member variable in static block

package Misc;

public class StaticBlockQuestions_5 {

	String name;
	static int age = 20;

	static {
		StaticBlockQuestions_5 myObj = new StaticBlockQuestions_5(); // Non static -- We need to create obj as we do in main method)
		myObj.name = "Azeez";
		age = 40; // Static
		System.out.println(myObj.name + " " + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}