package com.jsp.programming;

import java.util.Scanner;

public class Primenumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find prime no or not");
		int n=sc.nextInt();
		boolean rs=prime(n);
		System.out.println(rs);
	}


	static boolean prime(int n)
	{
		for (int i = 2; i <=n/2; i++)
		{
			if(n%i==0)
			return false;
		}
		return true;
	}
}
