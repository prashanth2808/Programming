package com.jsp.arrays.practice;

public class Merginganarrayinzigzagordersorted {
	int[] mergesort (int[] a , int[] b)
	{

		int[] c =new int[a.length+b.length];
		int i=0,j=0,k=0;
		while (i<a.length && j<b.length)
		{
			if(a[i]<b[j])
				c[k++]=a[i++];
			else

				c[k++]=b[j++];
		}
		while (i<a.length) 
		{
			c[k++]=a[i++];
		}
		while (j<b.length) 
		{
			c[k++]=b[j++];
		}
		return c;

	}
}


