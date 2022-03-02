// java.lang.System	| java.io.PrintStream

package Misc;

public class HowSystemOutPrintlnWorksInternallyInJava {

	public static void main(String[] args) {

		System.out.println("Hello World");
		// System: Class
		// out: ref var (public static final variable)
		// println: Method

	}

}

/**
 * 'out' is public static final var available in System class of
 * java.lang.System package which is the type of PrintStream class available in
 * java.io.PrintStream package. Thus , we can call println().
 */
