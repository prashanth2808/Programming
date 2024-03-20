package com.jsp.programmingmoderate;

import java.util.Scanner;

public class Emirp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n =sc.nextInt();
		boolean rs=emirp(n);
		System.out.println(rs);

	}

	static boolean emirp(int n) {
		return isprime(n)&&isprime(rev(n));
	}

	

	private static boolean isprime(int n) {

		for (int i = 2; i <n/2; i++) {
			if(n%i==0)
				return false;
		}

		return true;
	}

	private static int rev(int n) {
		int rev=0;
		do {
			
			int d =n%10;
			rev=rev*10+d;
			n=n/10;
			
		} while (n!=0);
		return rev;
	
	}
 
}
