package com.jsp.twodarrays;

import java.util.Arrays;

public class Biggestelementfromthematrix {
	public static void main(String[] args) {
		Matrixinputs m = new Matrixinputs();
		int[][] rs = m.readmatrix();
		biggestelementfromthematrix(rs);

	}

	static void biggestelementfromthematrix(int[][] a) 
	{
		int big=0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				if(a[i][j] > a[j][i])
				{
					big=a[j][i];
					a[j][i]=a[i][j];
					a[i][j]=big;
				}
			}	
		}
		System.out.println(big);
	}	
}
