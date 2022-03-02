package Misc.StaticMethods;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start(); // BMW start() method would be called (Not Car). // Dynamic Polymorphism
		b.stop(); // From car class
		b.refuel(); // From car class

		b.repair(); // Gives a warning

		Car.repair(); // This is perfect

		b.engine(); // Accessing property from grand-parent

		Vehicle v1 = new BMW(); // Top-casting/ Upcasting
		v1.engine(); // Only vehicle class elements possible (Others not)

	}

}
