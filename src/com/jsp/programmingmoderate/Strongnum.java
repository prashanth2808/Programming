package com.jsp.programmingmoderate;

import java.util.Scanner;

public class Strongnum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n =sc.nextInt();
		boolean rs = strongnum(n);
		if(rs)
			System.out.println(n+" is a strongnumber");
		else
			System.out.println(n+" is not a strongnumber");
	}

	static boolean strongnum(int n) {
		int sum =0;
		int temp=n;
		do {
			int d=n%10;
			sum =sum+fact(d);
			n=n/10;
		}while(n!=0);
		return sum==temp;
	}

	static int fact(int n) {

		int sum=1;
		for(int i =1;i<=n;i++)
			sum =sum*i;

		return sum;
	}
}
//DAMT return true if the number is armstrong number else return false
//DAMT return reverse of the number
