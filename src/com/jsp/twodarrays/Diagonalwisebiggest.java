package com.jsp.twodarrays;

import java.util.Arrays;

public class Diagonalwisebiggest {
	public static void main(String[] args) {
		int[][] rs = Matrixinputs.readmatrix();
		diagonalwisebiggest(rs);
	}

	static void diagonalwisebiggest(int[][] mat)
	{
		int f=0,l=mat.length-1;

		int pbig=mat[0][0],sbig=mat[0][l];
		while(f<mat.length && l>=0)
		{
			if(mat[l][f]>pbig)
				pbig=mat[f][l];
			if(mat[l][f]>sbig)
				sbig=mat[l][f];
			f++;
			l--;
		}
	System.out.println(Arrays.deepToString(mat));

	}
}