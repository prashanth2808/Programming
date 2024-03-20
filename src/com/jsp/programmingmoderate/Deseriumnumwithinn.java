package com.jsp.programmingmoderate;

import java.util.Scanner;

public class Deseriumnumwithinn {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n =sc.nextInt();
		for (int p = 1; p <=n; p++) {
			boolean rs = deseriumnum(p);
			if(rs) {
				System.out.println(p);
			}
		}
	}
	static boolean deseriumnum(int n) {
		int p=count(n);
		int temp=n;
		int sum=0;
		do {
			int d=n%10;
			sum = sum+pow(d,p);
			p--;
			n=n/10;
		} while (n!=0);
		return sum==temp;
	}

	static int count(int n) {
		int c=0;
		do {
			c++;
			n=n/10;
		} while (n!=0);
		return c;
	}

	static int pow(int n, int p) {
		int prod=1;
		while (p>0) {
			prod=prod*n;
			p--;
		}
		return prod;
	}
}


