package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix_Multiplication {
	
	public static int[][] createMatrix(int rows, int columns, Scanner sc){
		System.out.print("Enter the elements: ");
		int[][] matrix = new int[rows][columns];
		for (int i = 0 ; i < rows ; i ++) {
			for (int j = 0 ; j < columns ; j ++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		return matrix;
	}
	
	public static void displayMatrix(int[][] matrix){
		for(int[] m : matrix) {
			System.out.println(Arrays.toString(m));
		}
	}
	
	public static int[][] productOfMatrices(int rows1, int columns1, int rows2, int columns2, int[][] matrix1, int[][] matrix2){
		int[][] productMatrix = new int[columns1][rows2];
		for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < rows2 || k < columns1; k++)	// Both rows2 & columns1 are same
				productMatrix[i][j]+= matrix1[i][k] * matrix2[k][j];
			}
		}
		return productMatrix;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of rows in Matrix 1: ");
		int rows1 = sc.nextInt();
		
		System.out.println("Enter number of columns in Matrix 1: ");
		int columns1 = sc.nextInt();
		
		System.out.println("Enter number of rows in Matrix 2: ");
		int rows2 = sc.nextInt();
		
		System.out.println("Enter number of columns in Matrix 2: ");
		int columns2 = sc.nextInt();
		
		if ((rows1 == columns2) && (columns1 == rows2)) {
			System.out.println("Matrix 1 ");
			int[][] matrix1 = createMatrix(rows1, columns1, sc);
			System.out.println("Matrix 2");
			int[][] matrix2 = createMatrix(rows2, columns2, sc);
			System.out.println("\nMatrix 1");
			displayMatrix(matrix1);
			System.out.println("\nMatrix 2");
			displayMatrix(matrix2);
			
			int[][] productMatrix = productOfMatrices(rows1, columns1, rows2, columns2, matrix1, matrix2);
			System.out.println("\nProduct Matrix");
			displayMatrix(productMatrix);
			
		}
		else {
			System.out.println("The matrices cannot be multiplied :(");
			sc.close();
			return;
		}

	}

}