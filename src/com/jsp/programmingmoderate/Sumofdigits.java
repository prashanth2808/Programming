package com.jsp.programmingmoderate;

import java.util.Scanner;

public class Sumofdigits {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n =sc.nextInt();
		int i = method(n);
		System.out.println("sum of digits:"+i);

	}

	static int method(int n) {
		int sum=0;
		do {
			int d =n%10;
			sum+=d;
			n=n/10;
		} while (n!=0);
		return sum;
	}
}

