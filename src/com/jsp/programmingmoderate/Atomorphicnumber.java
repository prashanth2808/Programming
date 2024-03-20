package com.jsp.programmingmoderate;

import java.util.Scanner;

public class Atomorphicnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the number");
		int n =sc.nextInt();
		boolean rs=atomorphicnum(n);
		if(rs)
			System.err.println(rs);
		else
			System.err.println(rs);

	}

	static boolean atomorphicnum(int n)
	{
		int s=n*n;
		System.out.println(s);
		while (n>0) {
			if (n%10!=s%10) 
			{
				return false;

			}

			n=n/10;
			s=s/10;
		}

		return n==0;

	}
}
