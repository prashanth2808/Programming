package com.jsp.arrays.practice;

public class Mergearrayinspecifiedorder {
public static void main(String[] args) {

	int[] a= {10,20,40,50,60};
	 a=insertarray(a,30,2);
	
	
}

 static int[] insertarray(int[] x, int ele, int in) {

	 if(in<0||in>x.length)
	 {
		 System.out.println("index not in range");
		 return x;
	 }
	 int[] y=new int[x.length+1];
	 y[in]=ele;
	 for(int i=0;i<x.length;i++)
		 
	 {
		 if(i<in)
			 y[i]=x[i];
		 else
			 y[i+1]=x[i];
					 
	 }
	 return y;
}
}
