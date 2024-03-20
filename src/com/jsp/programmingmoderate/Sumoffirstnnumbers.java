package com.jsp.programmingmoderate;

import java.util.Scanner;

public class Sumoffirstnnumbers {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n =sc.nextInt();
		int i = naturalnum(n);
		System.out.println(i);

	}

	static int naturalnum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum+i;
		}
		return sum;	
	}
}
