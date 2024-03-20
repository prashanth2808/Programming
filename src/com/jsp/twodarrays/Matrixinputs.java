package com.jsp.twodarrays;

import java.util.Scanner;

public class Matrixinputs {
	public static void main(String[] args)
	{
readmatrix();

	}
	static int[][] readmatrix() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order of matrix :");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[] mat[] = new int[row][col];

		System.out.println("Enter the value in "+row+"x"+col+" row wise :" );

		for (int i = 0; i < mat.length; i++)
		{
			for (int j = 0; j < mat[i].length; j++) 
			{
				mat[i][j]=sc.nextInt();
			}	
		}
		return mat;
	}
	
	static void printmatrix(int[][] mat)
	{
		System.out.println("User entered matrix :");

		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j < mat[i].length; j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}	

