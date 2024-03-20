package com.jsp.twodarrays;

import java.util.Arrays;

public class Transposethematrix {
	public static void main(String[] args) 
	{
		Matrixinputs m = new  Matrixinputs();
		int[][] a = m.readmatrix();
		int[][] is = transposematrix(a);
		
		System.out.println("Transposed matrix: "+Arrays.deepToString(is));
	}

	private static int[][] transposematrix(int[][] a) 
	{
		int[][] n = new int[a[0].length][a.length];

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				n[j][i]=a[i][j];
			}
		}
		return n;
		
	}

}
