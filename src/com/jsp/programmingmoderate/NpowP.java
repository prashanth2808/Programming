package com.jsp.programmingmoderate;

import java.util.Scanner;

public class NpowP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n =sc.nextInt();
		int p=sc.nextInt();
		int i = pow(n,p);
		System.out.println(i);

	}

	static int pow(int n,int p) {
		int prod=1;
		while (p>0) 
		{
			prod=prod*n;		 
			p--;
		}



		return prod;
	}
}
