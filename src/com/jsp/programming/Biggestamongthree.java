package com.jsp.programming;

import java.util.Scanner;

public class Biggestamongthree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = biggest(a, b, c);
		System.out.println(d+ "is the biggest");

	}


	static Double biggest(double a,double b,double c)
	{
		if(a>b && a>c)
			return a;
		else if (b>a && b>c)
			return b;		
		else
			return c;	}
}
