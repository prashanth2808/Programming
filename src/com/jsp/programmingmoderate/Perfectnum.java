 package com.jsp.programmingmoderate;

import java.util.Scanner;

public class Perfectnum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n =sc.nextInt();
		boolean rs=perfect(n);
		System.out.println(rs);

	}

	static boolean perfect(int n) 
	{
		int sum =0;

		for (int i = 1; i <= n/2; i++)
		{
			if(n%i==0)
			sum=sum+i;//1+2+4+7+14
		}
		return sum==n;

	}

}

