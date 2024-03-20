package com.jsp.programming;

import java.util.Scanner;

public class numberordigi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();

if(n>=-9 && n<=9)
	System.out.println(n+ " is a digit ");
else if (n > 99) 
	System.out.println(n+ " is a number in hundreds");

else
	System.out.println(n+ "is a number");
}
	
}
