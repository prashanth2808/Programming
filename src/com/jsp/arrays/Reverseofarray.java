package com.jsp.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Reverseofarray {
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
		reverse(ar);
		System.out.println(Arrays.toString(ar));
	}

	static void reverse(int[] x)
	{
		int i = 0,j= x.length-1;
		while(i<j)

		{
			int temp=x[i];
			x[i]=x[j];
			x[j]=temp;
			i++;
			j--;
		}


	}
}
