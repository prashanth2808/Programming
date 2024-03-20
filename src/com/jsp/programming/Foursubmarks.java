package com.jsp.programming;

import java.util.Scanner;

public class Foursubmarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the of sub 1");
		int a=sc.nextInt();
		System.out.println("Enter the of sub 2");
		int b=sc.nextInt();
		System.out.println("Enter the of sub 3");
		int c=sc.nextInt();
		System.out.println("Enter the of sub 4");
		int d=sc.nextInt();
		String st = grade(a,b,c,d);
		System.out.println(st);


	}

	static String grade(int a, int b,int c ,int d) {

		int sum =(a+b+c+d);
		
		if (sum>=350)
			return"distinction";
		else	 if (sum>=300)
			return"first class";
		else if (sum>=250)
			return"second class";
		else if (sum>=200)
			return"pass";
		else
			return "fail";
	}
}
