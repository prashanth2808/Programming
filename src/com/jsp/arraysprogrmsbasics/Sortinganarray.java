package com.jsp.arraysprogrmsbasics;

import java.util.Arrays;

public class Sortinganarray {
	public static void main(String[] args) 
	{
		Mainarray ma = new Mainarray();
		int[] rs = ma.readinput();
		sorting(rs);
	}

	static void sorting(int[] x)
	{
		int temp=0;
		for(int i=0;i<x.length;i++)
		{
			temp=x[i];
			if(x[i]>=temp)
			System.out.println(x[i]);
		}
	}
}
