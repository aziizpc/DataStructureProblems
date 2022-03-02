package String;

public class RemoveMultipleSpaceBetweenWords {

	public static void main(String[] args) {

		String s = "     Hello              World      !!!     ";

		System.out.println(s.replaceAll("( +)", " ").trim()); // .trim() is to remove spaces at beginning and end

	}

}