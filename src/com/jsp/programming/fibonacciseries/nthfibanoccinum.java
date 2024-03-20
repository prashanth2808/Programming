package com.jsp.programming.fibonacciseries;

import java.util.Scanner;

public class nthfibanoccinum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n  =sc.nextInt();
		int i = fibanocci(n);
		System.out.print(i);

	}

	static  int fibanocci(int n) {
		int f1=0; int f2=1;
		while(n>1)
		{
			int f3=f1+f2;
			f1=f2;
			f2=f3;
			n--;
		}
		return f1;

	}
}
