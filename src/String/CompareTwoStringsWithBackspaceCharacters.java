//TC = O(n + m) | SC = O(n+m)

package String;

import java.util.Stack;

public class CompareTwoStringsWithBackspaceCharacters {

	private static boolean backSpaceCompare(String firstString, String secondString) {
		// Process the strings and check if they are equal
		return compareString(firstString).equals(compareString(secondString));
	}

	// Function to reform a string
	private static String compareString(String processString) {
		char sArr[] = processString.toCharArray();
		
		// Create an empty stack
		Stack<Character> myStack = new Stack<>(); // Declare a Stack
		
		// Traverse in the array
		for (int i = 0; i < sArr.length; i++) {
			// If current character is # and stack is empty, pop out an item from stack
			if (sArr[i] == '#' && !myStack.isEmpty()) {
				myStack.pop();
			}
			// If current character is not #, push it into the stack
			if (sArr[i] != '#') {
				myStack.push(sArr[i]);
			}
		}
		// Stack contains the string in reverse order, return the reversed string
		// As it does not affect the comparison
		System.out.println(String.valueOf(myStack));
		return String.valueOf(myStack);
	}

	public static void main(String[] args) {
		// Example 1
		System.out.println(backSpaceCompare("ab#c", "ad#c"));
		// Example 2
		System.out.println(backSpaceCompare("ab##", "c#d#"));
		// Example 3
		System.out.println(backSpaceCompare("a#c", "b"));
	}
}