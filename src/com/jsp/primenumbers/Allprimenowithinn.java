package com.jsp.primenumbers;

import java.util.Scanner;

public class Allprimenowithinn {
	public static void main(String[] args) {

	
		
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the numbers");
		int n =sc.nextInt();
		for (int j = 1; j <=n; j++)
		{
			if(isprime(j))
				System.out.println(j);
		}
	}

	private static boolean isprime(int j) {
		for (int i = 2; i <=j/2; i++)
		{
			if(j%i==0)
				return false;

		}
		return true;
	}
}


//for (int j = 1; j <=n; j++)
//{
//	if(isprime(j))
//		System.out.println(j);
//}
//}