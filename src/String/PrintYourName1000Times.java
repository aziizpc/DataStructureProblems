package String;

public class PrintYourName1000Times {

	public static void main(String[] args) {

		String myName = "Azeez";
		
		String s = "i";
		
		s = s.replaceAll("i", "iiiiiiiiii"); // 10
		s = s.replaceAll("i", "iiiiiiiiii"); // 100
		s = s.replaceAll("i", "iiiiiiiiii"); // 1000
		
		s = s.replaceAll("i", "Azeez\n");
		
		System.out.println(s);

	}

}
