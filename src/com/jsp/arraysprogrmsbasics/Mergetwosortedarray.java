package com.jsp.arraysprogrmsbasics;

import java.util.Arrays;

public class Mergetwosortedarray {
	public static void main(String[] args) {
		Mainarray ma = new Mainarray();
		int[] a = ma.readinput();
		int[] b=ma.readinput();
		int[] is = Sortedarray1(a);
		System.out.println(Arrays.toString(is));
		int[] is2 = Sortedarray2(b);
		System.out.println(Arrays.toString(is2));
		int[] is3 = Sortedall(is,is2);
		System.out.println(Arrays.toString(is3));
	}

	static int[] Sortedarray2(int[] y) 
	{
		for (int i = 0; i < y.length-1; i++) {
			for (int j = 0; j < y.length-i-1; j++) {
				if(y[j]>y[j+1])
				{
					int temp=y[j];
					y[j]=y[j+1];
					y[j+1]=temp;
				}
			}
		}
		return y;
	}

	static int[] Sortedarray1(int[] x)
	{
		for (int i = 0; i < x.length-1; i++)
		{
			for (int j = 0; j < x.length-i-1; j++)
			{
				if(x[j]>x[j+1])
				{
					int temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}
		return x;
	}

	static int[] Sortedall(int[] is, int[] is2)
	{
		int t[] = new int[is.length+is2.length];
		for (int i = 0; i < is.length; i++) 
		{
			t[i]=is[i];

		}
		for (int i = 0; i < is2.length; i++) {
			t[is.length+i]=is2[i];
		}
		return t;

	}
}
