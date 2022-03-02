package String;

import java.util.Stack;

public class CheckGivenStringIsWellFormedOrNot {

	// function to check if brackets are balanced
	static boolean areBracketsBalanced(String s) { // Note: static function
		// Using ArrayDeque is faster than using Stack class
		Stack<Character> myStack = new Stack<>(); // Declared outside for loop

		// Traversing the Expression
		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			if (c == '(' || c == '[' || c == '{') {
				// Push the element in the stack
				myStack.push(c);
				System.out.println("Push: " + myStack);
				continue; // Stops current iteration and go to the next one
			}

			// If current character is not opening
			// bracket, then it must be closing. So stack
			// cannot be empty at this point.
			if (myStack.isEmpty()) // Why this?? -- We first try to push all the {({ and then see if it's empty.
									// Empty ==> String has only ]}).
				return false;

			char toCheckAfterPopping;
			switch (c) {
			case ')':
				toCheckAfterPopping = myStack.pop();
				System.out.println("Pop: " + myStack);
				if (toCheckAfterPopping == '{' || toCheckAfterPopping == '[')
					return false;
				break;

			case '}':
				toCheckAfterPopping = myStack.pop();
				System.out.println("Pop: " + myStack);
				if (toCheckAfterPopping == '(' || toCheckAfterPopping == '[')
					return false;
				break;

			case ']':
				toCheckAfterPopping = myStack.pop();
				System.out.println("Pop: " + myStack);
				if (toCheckAfterPopping == '(' || toCheckAfterPopping == '{')
					return false;
				break;
			}
		}

		// Check Empty Stack
		return (myStack.isEmpty()); // Returns TRUE if the stack is empty (That is, WELL FORMED)
	}

	// Driver code
	public static void main(String[] args) {
		// String s = "{}([{}])[]";
		String s = "(A)";

		// Function call
		if (areBracketsBalanced(s))
			System.out.println("The String is well formed :)");
		else
			System.out.println("The String is not well formed :(");
	}
}