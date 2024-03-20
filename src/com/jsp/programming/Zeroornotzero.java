package com.jsp.programming;

import java.util.Scanner;

public class Zeroornotzero {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		if(n>0)
		{
			System.out.println(n+" is not zero");
		}
		else if (n==0)
		{
			System.out.println("it is "+n);
		}
	}
}
