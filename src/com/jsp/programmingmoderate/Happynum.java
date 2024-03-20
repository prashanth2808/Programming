package com.jsp.programmingmoderate;

import java.util.Scanner;

public class Happynum {
public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the numbers");
		int n =sc.nextInt();
		boolean i = ishappy(n);
		System.out.println(i);
	}


	static boolean ishappy(int n) {
		while (n>9)
		{
			n=sumofsquare(n);
		}
		return n==1||n==7;
	}


	static int sumofsquare(int n) 
	{
		int sum=0;
		do {
			int d=n%10;
			sum=sum+d*d;
			n=n/10;

		} while (n!=0);
		return sum;
	}

}
