package Misc;

import java.net.MalformedURLException;
import java.net.URL;

public class URLCompare {

	public static void main(String[] args) {

		try {
			System.out.println(new URL ("https://app.hubspot.com").equals(new URL ("https://104.19.155.83")));	// Returns true
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}