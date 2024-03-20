package com.jsp.arrays.practice;

public class Bubblesort {
	public static void main(String[] args) {
		Mainarr ma = new  Mainarr();
		int[] rs = ma.readinput();
		int[] is = bubblesort(rs);
		System.out.println(is);



	}

	static int[] bubblesort(int[] x)
	{
		for (int i = 0; i < x.length-1; i++)
		{
			for (int j = 1; j < x.length-1-i; j++)
			{
				if (x[j]>x[j+1])
				{
					int temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;

				}
			}
		}
		return x;

	}
}
