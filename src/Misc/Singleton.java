// Class that can have only one object/ instance of a class (Single instantiate) at a time.
// How?
// - Make Constructor as private.
// - Write a public static method that has return type of object of this Singleton class (Lazy initialization).
// - The purpose of the singleton class is to control object creation, limiting the number of objects to only one.
// - The singleton allows only one entry point to create the new instance of the class.
// - Singletons are often useful where we have to control the resources, such as database connections or sockets.
// Normal class: We use constructor to create objects
// Singleton class: We use getInstance() to create objects

package Misc;

public class Singleton {

	private static Singleton singleton_instance = null; // Init as null
	private String str;

	private Singleton() { // Constructor is private
		str = "Hey, I'm using Singleton class pattern";
	}

	public static Singleton getInstance() { // Lazy initialization
		if (singleton_instance == null)
			singleton_instance = new Singleton();	// Object creation
		return singleton_instance;
	}

	public static void main(String[] args) { // Main
		Singleton x = getInstance();
		Singleton y = getInstance();
		Singleton z = getInstance();

		x.str = (x.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

		z.str = (z.str).toLowerCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

	}
}