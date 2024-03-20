package com.jsp.programmingmoderate;

import java.util.Scanner;

public class Primeno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n =sc.nextInt();
		boolean i = isprime(n);
		System.out.println(i);
	}
	static boolean isprime(int n) {

		for (int i = 2; i <n/2; i++) {
			if(n%i==0)

				return false;
			System.out.println(i);

		}


		return true; 
	}
}