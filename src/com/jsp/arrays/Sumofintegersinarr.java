package com.jsp.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sumofintegersinarr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int []ar=new int[n];
		System.out.println("Enter "+n+" elements");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		sumofintegers(ar);
		System.out.print(Arrays.toString(ar));
	}

	static void sumofintegers(int[] x)
	{
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			x[i]=sumofdigits(x[i]);
		}
	}



	static int sumofdigits(int n)
	{
		int sum=0;
		while(n!=0)
		{		
			sum=sum+n%10;
			n=n/10;
		}
		return sum;
	}

}
