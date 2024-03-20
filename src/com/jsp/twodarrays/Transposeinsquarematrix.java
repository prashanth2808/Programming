package com.jsp.twodarrays;

import java.util.Arrays;

public class Transposeinsquarematrix {
	public static void main(String[] args) {
		Matrixinputs m =new Matrixinputs();
		int[][] rs = m.readmatrix();
		int[][] is = transposeinsquarematrix(rs);
		System.out.println(Arrays.deepToString(is));
	}

	static int[][] transposeinsquarematrix(int[][] a)
	{
		for (int i = 0; i < a.length; i++) {

			for(int j=i+1;j<a[i].length;j++)
			{
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		return a;
	}
}
