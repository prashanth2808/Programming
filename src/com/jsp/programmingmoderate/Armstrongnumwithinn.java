package com.jsp.programmingmoderate;

import java.util.Scanner;

public class Armstrongnumwithinn {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.err.println("Palindrom numbers from 100 to 9999 ");
		for (int p = 100; p <=9999; p++) {
			boolean rs = isArmstrong(p);
			if(rs)
			System.out.println(p);
		}
	}

	static boolean isArmstrong(int n)   
	{   		
		int p=countnum(n);
		int sum=0;
		int temp=n;

		do { 
			int d =n%10;
			sum=sum+pow(d,p);
			n=n/10;
		} while (n!=0);
		return sum==temp;
	}

	static int pow(int n, int p) {

		int prod=1;
		while(p>0)
		{
			prod=prod*n;
			p--;
		}
		return prod;

	}

	static int countnum(int n) {
		int count=0;
		do {
			count++;
			n=n/10;
		}while(n!=0);

		return count;
	}
}