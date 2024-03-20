package com.jsp.programmingmoderate;

import java.util.Scanner;

public class Xylem {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the numbers");
		int n =sc.nextInt();
		boolean rs = isxylem(n);
		if(rs)
		System.out.println(n+" xyleum");
		else
			System.out.println("pholeyum");
	}

	static boolean isxylem(int n) {
		int en=0;int mn=0;
		int temp=n;
		do {
			int d =n%10;
			if(n==d||temp==n)
				en+=d;
			else 
				mn+=d;

			n=n/10;


		} while (n!=0);
		if(en==mn)
			return true;
		else
			return false;

	}


}

