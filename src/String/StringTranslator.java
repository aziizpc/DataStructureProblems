package String;

import java.lang.reflect.Field;

public class StringTranslator {

	static {
		try {
			Field value = String.class.getDeclaredField("value");
			value.setAccessible(true);
			value.set("Hello Azeez", value.get("Hallloo Azeez"));
			value.set("Good morning Azeez", value.get("Suprabhaatham, Azeez"));
			value.set("How are you?", value.get("Engane irikkunnu?"));
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		System.out.println("Hello Azeez");
	}

}