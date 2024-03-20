package com.jsp.arrays.practice;

public class Merginganarrayinzigzagorder {
Mainarr ar = new Mainarr();
	
	
	int[] zigzag (int[] a , int[] b)
	{
	
int[] c =new int[a.length+b.length];
int i=0,j=0,k=0;
	while (i<a.length && j<b.length)
	{
	c[k++]=a[i++];
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
