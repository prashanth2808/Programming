package com.jsp.arraysprogrmsbasics;

public class Evenorodd {
	public static void main(String[] args) {

		Mainarray ma = new Mainarray();
		int[] rs = ma.readinput();
		evenorodd(rs);
	}

	static void evenorodd(int[] x) {
		for (int i = 0; i < x.length; i++)
		{
			if(x[i]%2==0)
System.out.println("even");			
else
	System.out.println("odd");
		}

	}

}
