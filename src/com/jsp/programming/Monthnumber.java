package com.jsp.programming;

import java.util.Scanner;

public class Monthnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month number");
		int n =sc.nextInt();
		if(n>=1 && n<=12)
			System.out.println("valid month");
		else 
			System.out.println("Invalid month");


	}

}
