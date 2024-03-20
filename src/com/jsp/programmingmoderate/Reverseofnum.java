package com.jsp.programmingmoderate;

import java.util.Scanner;

public class Reverseofnum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n =sc.nextInt();
		int i = rev(n);
		System.out.println(i);
	}


	static int rev(int n)
	{
		int rev=0;

		do {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		while(n!=0);
		return rev;
	}
}
