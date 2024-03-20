package com.jsp.programming;

import java.util.Scanner;

public class Biggestamongfour {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 4 decimal numbers");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d=sc.nextDouble();
		
		if(a>b && a>c && a>d)
			System.out.println(a+ "is greater among 4 nos");
		else if (b>a && b>c && b>d)
		System.out.println(b+ "is greater among 4 nos");
		else if (c>a && c>b && c>d)
			System.out.println(c+ "is greater among 4 nos");
		else
			System.out.println(d+" is greater among 4 nos");
	}
}
