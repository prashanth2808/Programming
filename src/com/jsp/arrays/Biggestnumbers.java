package com.jsp.arrays;

import java.util.Scanner;

public class Biggestnumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int [] ar= new int[n];
		System.out.println("Enter the "+n+"elements");
		for(int i=0;i<ar.length;i++)
		{
			 ar[i]=sc.nextInt();

		}
		int bg=biggestnum(ar);
		System.out.println(bg+" is the biggest number");

	}

	static int biggestnum(int[] x) {
int big=0;
for(int i=0;i<x.length;i++)
{
	   if(x[i]>big)
		big=x[i];
}
		return big;
		
	}
}