package com.jsp.arraysprogrmsbasics;

public class Averageofintegers {
	public static void main(String[] args) {
		Mainarray ma = new Mainarray();
		int[] rs = ma.readinput();
		int i = average(rs);
		System.out.println(i+" is the average");
	}

	static int average(int[] x) 
	{
		int sum=0;
		int avg = 0;
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
			avg=sum/x.length;
		}
		return avg;
	}
}
