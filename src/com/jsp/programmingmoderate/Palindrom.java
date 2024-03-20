package com.jsp.programmingmoderate;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n =sc.nextInt();
		boolean rs = palindrome(n);
		System.out.println(rs);

	}

	static boolean palindrome(int n) {
		return n==reverse(n);
	}

	static int reverse(int n) {
		int rev=0;
		do {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		} while (n!=0);
		
		return rev;

	}
}
