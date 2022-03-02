package String;

public class ReverseIndividualWordsInGivenString {

	public static void main(String[] args) {

		String s = "If you are not actively using SmartBear, please log out gracefully by clicking the \"LOGOUT\" link in the user drop down menu in the upper right, as we only have 70 user licenses.";
		System.out.println(s + "\n");
		String[] finalArray = s.split(" ");

		for (int i = 0; i < finalArray.length; i++) {
			System.out.println(finalArray[i]);
		}

		System.out.println("\n");

		for (int i = 0; i < finalArray.length; i++) { // Method 1 (Not right -- I did)
			StringBuilder sb = new StringBuilder(finalArray[i]);
			sb = sb.reverse();
			System.out.println(sb);
		}

		System.out.println("\n");

		s = "If you are not actively using SmartBear, please log out gracefully by clicking the \"LOGOUT\" link in the user drop down menu in the upper right, as we only have 70 user licenses.";

		String finalString = ""; // Method 2
		String tempString = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != ' ') {
				tempString = c + tempString;
			} else {
				finalString = finalString + tempString + " ";
				tempString = "";
			}
		}
		finalString = finalString + tempString; // To include the last word as the last word only pass through if block
		System.out.println(finalString);
	}
}