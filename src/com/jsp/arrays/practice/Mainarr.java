package com.jsp.arrays.practice;

import java.util.Scanner;

public class Mainarr {

	int[] readinput()
			{
	Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the size of array");
	 int n=sc.nextInt();
	 int[] ar= new int[n];
	 System.out.println("Enter the " +n+" elements");
	 for(int i=0;i<ar.length;i++)
	 {
	  	ar[n]=sc.nextInt();
	 }
	 return ar;
	 }
}
