package Misc.StaticMethods;

public class Car extends Vehicle {

	public void start() {
		System.out.println("Car --- Start");
	}

	public void stop() {
		System.out.println("Car --- Stop");
	}

	public void refuel() {
		System.out.println("Car --- Refuel");
	}

	// static method
	public static void repair() {
		System.out.println("Car --- Repair");
	}

	public static void repair(int a) {
		System.out.println("Car --- Repair"); // static method overloading possible
	}

	public static void repair(String s) {
		System.out.println("Car --- Repair"); // static method overloading possible
	}
}