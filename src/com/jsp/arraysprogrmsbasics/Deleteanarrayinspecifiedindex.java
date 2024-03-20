package com.jsp.arraysprogrmsbasics;

import java.util.Scanner;

public class Deleteanarrayinspecifiedindex 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the "+n+" values");
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i]=sc.nextInt();	
		}
		System.out.println("Enter the index to delete the element");
		int in=sc.nextInt();
		deleteanelement(ar,in);

	}

	static void deleteanelement(int[] x,int y) 
	{

		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j < x.length-y; j++)
			{
				if(x[i])

			}
		}

	}
}
