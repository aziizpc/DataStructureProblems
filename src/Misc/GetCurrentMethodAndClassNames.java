package Misc;

public class GetCurrentMethodAndClassNames {

	public static void getMethodName() {
		String methodName = new GetCurrentMethodAndClassNames() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println("Method Name: " + methodName);
	}

	public static void getClassName() {
		String className = new GetCurrentMethodAndClassNames() {
		}.getClass().getEnclosingClass().getName();
		System.out.println("Class Name: " + className);
	}

	public static void main(String[] args) {

		getMethodName();
		getClassName();

	}

}