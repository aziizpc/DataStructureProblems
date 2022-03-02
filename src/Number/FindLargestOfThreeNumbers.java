package Number;

import java.util.Scanner;

public class FindLargestOfThreeNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number:");
		int a = sc.nextInt();

		System.out.println("Enter Second Number:");
		int b = sc.nextInt();

		System.out.println("Enter Third Number:");
		int c = sc.nextInt();

		int largest = a > b ? a : b; // Largest of a & b
		largest = largest > c ? largest : c; // Largest of the above largest and c

		System.out.println("Largest is " + largest);
		
		sc.close();

	}

}