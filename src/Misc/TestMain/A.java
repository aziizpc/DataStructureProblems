// We can call a main method from a different class

package Misc.TestMain;

public class A {

	public static void main(String[] args) {
		System.out.println("A --- Main method");
		
		B.main(args);

	}

}
