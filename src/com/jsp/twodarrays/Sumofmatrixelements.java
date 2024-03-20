package com.jsp.twodarrays;

public class Sumofmatrixelements {
	public static void main(String[] args) {
		Matrixinputs ms = new Matrixinputs();
		int[][] rs = ms.readmatrix();
		sumofmatrix(rs);
	}

	static void sumofmatrix(int[][] rs) {
		int sum=0;
		for (int i = 0; i < rs.length; i++)
		{
			for (int j = 0; j < rs[i].length; j++) 
			{
				sum+=rs[i][j];
			}	
		}
		System.out.println("sum of matrix: "+sum);
	}
}
