package com.jsp.arraysprogrmsbasics;

import java.util.Arrays;

import com.jsp.arrays.Array;

public class Reverseanarray {
	public static void main(String[] args) {
		Mainarray ma= new Mainarray();
		int[] rs = ma.readinput();
		reverseanarray(rs);

	}

	static void reverseanarray(int[] x) 
	{
		for(int i=x.length-1;i>=0;i--)
		{
			System.out.println(x[i]+" reversed -----> "+i+" index");
		}
	}
}