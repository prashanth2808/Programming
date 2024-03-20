package com.jsp.programming;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n =sc.nextInt();
		int i = countdigit(n);
		System.out.println(i+" ");
	}
	//sum of digits
	static int countdigit(int n)
	{	
		int c=0;
		do {
			n=n/10;
			c++;

		} while (n!=0);

		return c;

	}
}