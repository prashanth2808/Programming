package com.jsp.programming;

import java.util.Scanner;

public class Numberordigit {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the integer");
	int  n = sc.nextInt();
	
	if(n>9)
	{
	System.out.println("it is a number");		
	}
	else if (n<9) {
		System.out.println("it is a digit");
}
}
}
