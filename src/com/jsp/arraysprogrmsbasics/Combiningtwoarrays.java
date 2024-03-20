package com.jsp.arraysprogrmsbasics;

import java.util.Arrays;

public class Combiningtwoarrays {
	public static void main(String[] args) {
		Mainarray ma = new Mainarray();
		int[] rs = ma.readinput();

		Mainarray ma1=new Mainarray();
		int[] rs1 = ma1.readinput();
		combinethearray(rs,rs1);
	}
	static void combinethearray(int[] x, int[] y)
	{
		int arr[] = new int[x.length+y.length];

		for (int i = 0; i < x.length; i++) 
		{
			arr[i]=x[i];
		}
		for (int i = 0; i < y.length; i++)
		{
			arr[x.length+i]=y[i];
		}
		System.out.println("Cobined array:");
		System.out.println(Arrays.toString(arr));
	}
}



