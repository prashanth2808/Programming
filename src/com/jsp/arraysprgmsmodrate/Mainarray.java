package com.jsp.arraysprgmsmodrate;

import java.util.Scanner;

public class Mainarray {
public static void main(String[] args) {
		
		int[] readinput = readinput();
		System.out.println(readinput);
		
	}
	static int[] readinput()
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n =sc.nextInt();
		int []ar=new int[n];
		System.out.println("Enter the "+n+" elements");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		return ar;
	}
}
