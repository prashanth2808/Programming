package com.jsp.programmingmoderate;

import java.util.Scanner;

public class Primenoinnumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n =sc.nextInt();
		int i = prime(n);
		System.out.println(i);
	}

	static int prime(int n)
	{
		int pc=0;
		do
		{
			int d =n%10;
			if(d==1||d==3||d==5||d==7)
				pc++;
			n=n/10;
		}while(n!=0);
		return pc;

	}
}