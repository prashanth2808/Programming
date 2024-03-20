package com.jsp.programmingmoderate;

import java.util.Scanner;

public class Sumofsquareofitsdigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n =sc.nextInt();
		int i = sumofsquare(n);
		System.out.println(i);
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
