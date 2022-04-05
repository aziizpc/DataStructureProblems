package String;

public class PercentageOfEachType {

	public static void main(String[] args) {

		String s = "Hello World *^857463443!#@#$@$%$^&+ India ORACLE :)";
		
		double upperCaseLettersLength = s.replaceAll("[^A-Z]", "").length();
		
		double lowerCaseLettersLength = s.replaceAll("[^a-z]", "").length();
		
		double digitsLength = s.replaceAll("[^0-9]", "").length();
		
		double specialCharactersLength = s.replaceAll("[A-Za-z0-9]", "").length();
		
		double totalCharacters = upperCaseLettersLength + lowerCaseLettersLength + digitsLength + specialCharactersLength;
		
		System.out.println(totalCharacters);
		
		double percentageOfUpperCaseLetters = (upperCaseLettersLength / totalCharacters) * 100;
		double percentageOfLowerCaseLetters = (lowerCaseLettersLength / totalCharacters) * 100;
		double percentageOfDigits = (digitsLength / totalCharacters) * 100;
		double percentageOfSpecialCharacters = (specialCharactersLength / totalCharacters) * 100;
		
		System.out.println("Upper Case: " + percentageOfUpperCaseLetters);
		System.out.println("Lower Case: " + percentageOfLowerCaseLetters);
		System.out.println("Digits: " + percentageOfDigits);
		System.out.println("Special Characters: " + percentageOfSpecialCharacters);		

	}

}