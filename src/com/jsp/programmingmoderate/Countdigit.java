package com.jsp.programmingmoderate;

import java.util.Scanner;

public class Countdigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n =sc.nextInt();
		int i = countdigit(n);
		System.out.println(i);

	}

	static int countdigit(int n) {

		int count=0;
		do {
			count++;
			n=n/10;
		}
		while(n!=0);


		return count;

	}
}
