package com.jsp.arrays;

import java.util.Scanner;

public class Integersvalues {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		int sum=0;
		System.out.println("Enter the "+n+" numbers");
		for(int i=0;i<ar.length;i++)
		{ 
			ar[i]=sc.nextInt();
		}
		
	}
}
