package String;

public class StringObject {

	public static void main(String[] args) {

		String s1 = new String("Hello, World !!!"); // Creates reference var (s1) in stack and two "Hello, World !!!"
													// objects in
													// Heap (One of it in String Constant Pool). Why 2 in Heap? --> We
													// used new k/w.

		String s2 = new String("Hello, World !!!"); // One in stack + One in Heap. No new entry in SCP.

		
		// The below format is called Literal
		String str1 = "Hello, World !!!"; // Ref var in stack + One in SCP
		String str2 = "Hello, World !!!"; // Ref var in stack which points to existing entry (Above) in SCP
		
		System.out.println(s1 == s2);
		System.out.println(str1 == str2);
		System.out.println(s1 == str1);
		System.out.println(str2 == s2);
		
		System.out.println("---------------------");
		
		System.out.println(s1.equals(s2));
		System.out.println(str1.equals(str2));
		System.out.println(s1.equals(str1));
		System.out.println(str2.equals(s2));

	}

}
