package com.jsp.arraysprogrmsbasics;

import java.util.Arrays;

public class Bubblesort {
	public static void main(String[] args) {
		Mainarray ma = new Mainarray();
		int[] rs = ma.readinput();
		bubblesort(rs);
	}

	static void bubblesort(int[] x) 
	{int temp=0;
	for (int i = 0; i < x.length-1; i++) 
	{
		for (int j =0; j<x.length-i-1; j++) 
		{
			if(x[j] > x[j+1])
			{
				temp=x[j];
				x[j]=x[j+1];
				x[j+1]=temp;
//				System.out.println("Sorted in order: ");
				System.out.println(Arrays.toString(x));

			}
		}
	}
	}
}
