package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix_Transpose {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		int rows = sc.nextInt();
		
		System.out.println("Enter number of column: ");
		int columns = sc.nextInt();
		
		int[][] matrix = new int[rows][columns];
		int[][] transpose = new int[columns][rows];
		
		System.out.println("Enter the elements: ");
		for (int i = 0 ; i < rows ; i ++) {
			for (int j = 0 ; j < columns ; j ++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matrix: ");
		for (int i = 0 ; i < rows ; i ++) {
			for (int j = 0 ; j < columns ; j ++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
		
		for(int[] m : matrix) {
			System.out.println(Arrays.toString(m));
		}
		
		System.out.println("Transpose: ");
		for (int i = 0 ; i < columns ; i ++) {	// Note
			for (int j = 0 ; j < rows ; j ++) {
				transpose[i][j] = matrix[j][i];
			}
		}
		for (int i = 0 ; i < columns ; i ++) {
			for (int j = 0 ; j < rows ; j ++) {
				System.out.print(transpose[i][j] + ", ");
			}
			System.out.println("");
		}
		
		for(int[] t : transpose) {
			System.out.println(Arrays.toString(t));
		}

	}

}