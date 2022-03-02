package Misc.StaticMethods;

public class BMW extends Car {

	@Override
	public void start() {
		System.out.println("BMW --- Start");
	}

	// public void repair() { // IMPORTANT -- This is NOT possible. (Simply trying
	// to Override)
	// System.out.println("BMW --- Repair");
	// }

	// @Override
	// public void repair(){ // IMPORTANT -- We cannot override a static method as
	// non-static
	// System.out.println("BMW --- Repair");
	// }

	// @Override
	// public static void repair() { // IMPORTANT -- We cannot override a static
	// method as static
	// System.out.println("BMW --- Repair");
	// }

	// Method Hiding (repair() method in superclass is hidden) ---> IMPORTANT (Both should be static)
	public static void repair() { // IMPORTANT -- This is possible (No @Override keyword. Means, not overriding.)
		System.out.println("BMW --- Repair");
	}
}