package com.jsp.arraysprogrmsbasics;

import java.util.Arrays;

public class Selectionsort {
	public static void main(String[] args) {
		Mainarray ma = new Mainarray();
		int[] rs = ma.readinput();
		int[] is = Selectionsort(rs);
		System.out.println(Arrays.toString(is));
	}

	static int[] Selectionsort(int[] x)
	{

		int temp=0;

		for (int i = 0; i < x.length-1; i++)
		{
			int smallest=i;
			for (int j = i+1; j < x.length ; j++) 
			{
				if(x[smallest] > x[j])
				{
					smallest=j;
				}
				temp=x[smallest];
				x[smallest]=x[i];
				x[i]=temp;
			}
		}
		return x;
	}
}
