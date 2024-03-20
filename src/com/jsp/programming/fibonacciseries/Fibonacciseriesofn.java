package com.jsp.programming.fibonacciseries;

import java.util.Scanner;

public class Fibonacciseriesofn {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n  =sc.nextInt();
		fibanocci(n);

	}

	static  void fibanocci(int n) {
		int f1=0; int f2=1;
		while(f1<n)
		{
			System.err.print(" "+f1);
			int f3=f1+f2;
			f1=f2;
			f2=f3;
		}


	}
}
