package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratingAnArrayList {

	public static void main(String[] args) {

		ArrayList<String> tvSeries = new ArrayList<String>();

		tvSeries.add("Breaking Bad");
		tvSeries.add("Game of Thrones");
		tvSeries.add("The Walking Dead");
		tvSeries.add("Prison Break");
		tvSeries.add("The Big Bang Theory");

		// Method 1: for each loop and lambda expression (Java 8)
		tvSeries.forEach(tvShow -> { // forEach (No iterator required)
			System.out.println(tvShow);
		});

		System.out.println("-----------------------------------------------");

		// Method 2: Iterator
		Iterator<String> myIterator1 = tvSeries.iterator();
		while (myIterator1.hasNext()) { // hasNext()
			String tvShow = myIterator1.next();
			System.out.println(tvShow);
		}

		System.out.println("-----------------------------------------------");

		// Method 3: Using iterator and Java 8 forEachRemaining() method
		Iterator<String> myIterator2 = tvSeries.iterator();
		myIterator2.forEachRemaining(tvShow -> { // forEachRemaining (While loop not required)
			System.out.println(tvShow);
		});

		System.out.println("-----------------------------------------------");

		// Method 4: Using for loop
		for (String tvShow : tvSeries) {
			System.out.println(tvShow);
		}

		System.out.println("-----------------------------------------------");

		// Method 5: Using for loop with order/ index
		for (int i = 0; i < tvSeries.size(); i++) {
			System.out.println(tvSeries.get(i));
		}

		System.out.println("-----------------------------------------------");

		// Method 6: Using listIterator() to traverse in both the directions

		ListIterator<String> myListIterator = tvSeries.listIterator(tvSeries.size());
		while (myListIterator.hasPrevious()) { // Reverse Order. Use .hasNext() to go in the normal order
			String tvShow = myListIterator.previous();
			System.out.println(tvShow);
		}

	}
}