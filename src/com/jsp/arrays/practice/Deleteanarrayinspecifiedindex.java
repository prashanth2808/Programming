package com.jsp.arrays.practice;

public class Deleteanarrayinspecifiedindex {

	public static void main(String[] args) {
		
	int[] ar= {10,20,30,30,40};
	ar=deleteanarray(ar,2);
}

	 static int[] deleteanarray(int[] x, int in) {
		
		 if(in<1||in>x.length) {
			 System.out.println("Index not in the range");
		 return x;
		 }
		 int[]  y = new int[x.length-1];
		 for (int i = 0; i < y.length; i++) {
			
	if (i<in) 
	{
		y[i]=x[i];
	} else {
y[i]=x[i+1];
	}
		 
	}
		return y;

	 }
}