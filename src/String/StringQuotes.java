package String;

public class StringQuotes {

	public static void main(String[] args) {

		System.out.println("Hello");
		
		// Need to print --> /"Hello"/
		// System.out.println("/"Hello"/"); Error
		System.out.println("/\"Hello\"/"); // Solved (Note) Added \
		
		
		// 		/'Hello'/
		System.out.println("/'Hello'/");	// Single quote ==> No problem
		
		//		"/'Hello'/"
		System.out.println("\"/'Hello'/\"");	// \ BEFORE "
		
		// 		"Hello"
		System.out.println("\"Hello\"");
		
		//		I love "Java" & "programming" and "movies"
		System.out.println("I love \"Java\" & \"programming\" and \"movies\"");		// Put \ BEFORE each "
		
		//		'I love "Java" & "programming" and "movies"'
		System.out.println("'I love \"Java\" & \"programming\" and \"movies\"'");
		
		// 		IMPORTANT
		//	//input[@id = '"+variable+"'] --> When passing variable for XPath

	}

}