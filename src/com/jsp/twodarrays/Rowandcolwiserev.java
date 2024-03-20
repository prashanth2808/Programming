package com.jsp.twodarrays;

import java.util.Arrays;

public class Rowandcolwiserev {
	public static void main(String[] args) {
		int[][] rs = Matrixinputs.readmatrix();
		//		rowwiserev(rs);
		colwiserev(rs);

	}

	static void colwiserev(int[][] mat) {

		for (int i = 0; i < mat.length; i++)
		{
			int f=0,l=mat[0].length-1;
			while(f<l)
			{
				int temp=mat[f][i];
				mat[f][i]=mat[l][i];
				mat[l][i]=temp;
				f++;
				l--;
			}
		}
		System.out.println(Arrays.deepToString(mat)); 
	}
}

//	static void rowwiserev(int[][] mat)
//	{
//		for (int i = 0; i < mat.length; i++) 
//		{
//			int f=0,l=mat[i].length-1;
//			while(f<l)
//			{
//				int temp=mat[i][f];
//				mat[i][f]=mat[i][l];
//				mat[i][l]=temp;
//				f++;
//				l--;
// 			}
//			
//		
//		}
//	System.out.println(Arrays.deepToString(mat)); 
//	}
//}
