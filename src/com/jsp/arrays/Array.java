package com.jsp.arrays;

import java.util.Scanner;

public class Array {
	//	public static void main(String[] args) {
	//		Scanner sc = new Scanner(System.in);
	//		System.out.println("Enter the size of an array");
	//		int n=sc.nextInt();
	//		int[] ar= new int[n];
	//		System.out.println("Enter the "+n+" values:");
	//		
	//		for(int i=0;i<ar.length;i++)
	//		{
	//			ar[i] = sc.nextInt();
	//		}
	//		System.out.println("Reverse orderd values are :");
	//		
	//			for(int i=ar.length-1;i>=0;i--)
	//			{
	//				System.out.println(ar[i]);
	//			}
	//		
	//	}
	//}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the "+n+" numbers");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		 System.out.println("Reverse order of array is:");

		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
	}
}