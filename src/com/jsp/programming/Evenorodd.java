package com.jsp.programming;

import java.util.Scanner;

public class Evenorodd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no");
		int n = scanner.nextInt();
		String[]st = {"even","odd"};
		System.out.println(n+" is an "+st[n%2]);
	}
}


//without using any condtional statement
//	{
//	int n=5;
//	String st = ((n%2==0)?"even":"odd");
//	System.out.println(n+" is "+st);
//}  