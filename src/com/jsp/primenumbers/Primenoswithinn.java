package com.jsp.primenumbers;

import java.util.Scanner;

public class Primenoswithinn {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the range");
		int n =sc.nextInt();
		int count=0;
		for (int j = 1; count <n; j++)
		{
			if(isprime(j)) {
				System.out.println(j);
				count++;}
		}
	}

	 static boolean isprime(int j) {
		for (int i = 2; i <=j/2; i++)
		{
			if(j%i==0)
				return false;

		}
		return true;
	}


}


