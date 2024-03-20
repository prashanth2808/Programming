package com.jsp.arraysprogrmsbasics;

public class Replaceeveryelementinthearraybytheresumofitsdigits {
	public static void main(String[] args) {
		Mainarray  ma = new Mainarray();
		int[] rs = ma.readinput();
		sumofdigitsinarray(rs);
	}

	static void sumofdigitsinarray(int[] x) 
	{ 		
		int num=0;
		for (int i = 0; i < x.length; i++) 
		{
			int sum=num+sumofdigits(x[i]);
			int[] y=new int[x.length];
			y[i]+=sum;
			System.out.println("new array "+y[i]+ " -----> in index " +i);
		}
	}

	static int sumofdigits(int n) 
	{
		int sum=0;
		do
		{
			int d=n%10;
			sum+=d;
			n=n/10;
		}
		while (n!=0);
		return sum;
	}
}

