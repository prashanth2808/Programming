package com.jsp.arraysprogrmsbasics;

public class Primenumbers {
	public static void main(String[] args) {
		Mainarray ma= new  Mainarray();
		int[] rs = ma.readinput();
		 String string = primenumber(rs);
		System.out.println(string);

	}

	static String primenumber(int[] x) 
	{
		for (int i = 0; i < x.length; i++) 
		{
			for(int j=2;j<x[i]/2;j++)
			{
				if(x[i]%j==0) 

					return "not a prime number";
			}

		}
		return "prime nnumber";
	}
}