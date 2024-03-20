package com.jsp.programmingmoderate;

import java.util.Scanner;
//palindrom to return true or false
public class Palindrommethod2 

{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n =sc.nextInt();
		boolean i =palindrom(n);
		System.out.println(i);
	}

	static boolean palindrom(int n) {

		int rev=0;int temp=n;
		do {

			int d=n%10;
			rev=rev*10+d;	 
			n=n/10;
		} while (n!=0);
		return rev==temp;	 
	}
}
