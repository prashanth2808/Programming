package com.jsp.programmingmoderate;

import java.util.Scanner;

public class Evendigitsinnum {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n =sc.nextInt();
		int i = evendigits(n);
		System.out.println(i+ ":no of even digits");
	}
	static int evendigits(int n) 
	{
		int ecount=0;

		do 
		{
			int d =n%10;
			if(d%2==0)
				ecount++;
			n=n/10;
		}	while (n!=0) ;

		return ecount;	
	}
}
