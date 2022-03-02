package Misc;

public class StaticBlock {

	public static void main(String[] args) {

		System.out.println(Main.x); // This will just print 100 (Will not print static content). Why? Main.x will be
									// directly replace by 100 as it's final.

		System.out.println("-----------------");

		System.out.println(Main.y); // Will print static content first and then 99.

	}

}

class Main {

	public static final int x = 100;
	public static int y = 99;

	static {
		System.out.println("main Class --- Static Block");
	}

}