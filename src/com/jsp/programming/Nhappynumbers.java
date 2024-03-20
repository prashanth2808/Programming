package com.jsp.programming;

import java.util.Scanner;

public class Nhappynumbers {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the numbers");
		int n =sc.nextInt();
		int count=0;
		for (int p = 1; count<n; p++) {
			{
				boolean rs = ishappy(p);
				if(rs)
				{
					System.out.println(p);
					count++;

				}
	}
		}
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

