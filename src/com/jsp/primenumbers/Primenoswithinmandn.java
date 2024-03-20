package com.jsp.primenumbers;

import java.util.Scanner;

public class Primenoswithinmandn {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the n");
		int n =sc.nextInt();
		int sum=0;
		for (int j = 1; j<=n; j++)
		{
			boolean rs = isprime(j);
			if (rs)
			sum=sum+j;
		}
		System.out.print(sum+" ");

	}



	static boolean isprime(int j) 
	{
		for (int i = 2; i <=j/2; i++)
		{
			if(j%i==0)
				return false;
		}
		return true;
	}
}

