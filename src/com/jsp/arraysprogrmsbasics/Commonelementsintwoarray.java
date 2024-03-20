package com.jsp.arraysprogrmsbasics;

public class Commonelementsintwoarray {
	public static void main(String[] args) {
		Mainarray  ma = new  Mainarray();
		int[] a = ma.readinput();
		int[] b = ma.readinput();
		commonnumsintwoarray(a,b);
	}

	 static void commonnumsintwoarray(int[] x, int[] y)
	 {
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j < y.length; j++) 
			{
				if (x[i]==y[j]) 
				{
					System.out.println("Common elements: "+x[i]);
					break;
				}
			}
		}
	}

}
