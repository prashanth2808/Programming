package com.jsp.twodarrays;

import java.util.Arrays;

public class Additionoftwomatrix 
{
	public static void main(String[] args) {
		Matrixinputs m= new Matrixinputs();
		Matrixinputs m1= new Matrixinputs();
		int[][] rs = m.readmatrix();
		int[][] rs1 = m1.readmatrix();

		int[][] is = additiononftwomatrix(rs,rs1);
		System.out.println(Arrays.deepToString(is));

	}

	static int[][] additiononftwomatrix(int[][] a, int[][] b)
	{
		if(a.length!=b.length||a[0].length!=b[0].length)//a[0].length!=b[0].length is used to check weather no of elements in rows n cols in matrix are in same order or not
			return null;
		int c[][]= new int[a.length][a[0].length];//a[0].length to store how many elements in the arrays
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
	}

}
