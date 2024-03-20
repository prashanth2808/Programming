package com.jsp.arraysprogrmsbasics;

public class Sumofintegers {
	public static void main(String[] args) 
	{
		Mainarray ma = new Mainarray();
		int[] x = ma.readinput();
		int i = sumofint(x);
		System.out.println(i+" is the sum");
	}
	static int sumofint(int[] x)
	{
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}
		return sum;
	}
}