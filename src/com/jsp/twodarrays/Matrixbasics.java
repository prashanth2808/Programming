package com.jsp.twodarrays;

import java.util.Scanner;

public class Matrixbasics {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order of matrix");
		int row=sc.nextInt();
		int col= sc.nextInt();
		int[] mat[]= new int[row][col];

		System.out.println("Enter the "+row+"x"+col+" matrix row wise"  );

		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j < mat[i].length; j++) 
			{
				mat[i][j]=sc.nextInt();		
			}	
		}
		System.out.println("User entered matrix");


		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) 
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
