package com.jsp.arraysprgmsmodrate;

import java.util.Arrays;

import com.jsp.arrays.Array;

public class Deletetheduplicatesinarray {
	public static void main(String[] args) {
		Mainarray ma = new Mainarray();
		int[] rs = ma.readinput();
		
	}

	private static void array(int[] x) 
	{
		int[] y=new int[x.length];
		int n=0;
		for (int i = 0; i < x.length; i++) {
			int j=0;
			while (j<n) {
				if(y[j]==x[i])
					break;
				if(j==n)
					x[n++]=x[i];
			}
			
		}
		int[] is= new int[n];
		for (int k = 0; k < n; k++) {
			is[k]=y[k];
		}
System.out.println();
	}
}
