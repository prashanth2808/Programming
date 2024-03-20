package com.jsp.programming;

import java.util.Scanner;

public class Factorialofn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		int i = factorial(n);
		System.out.println(i);
	}



	static int factorial(int n) 

	{	
		int sum=1;
		for (int i = 1; i <=n; i++) {
			 System.out.println(sum+"*"+i+"="+(sum*i));
	    sum = sum*i;	
	   
		}
		return sum;
	}
}







//no of factorial for a number
//	static int factorial(int n) {
//
//		int sum=1;
//
//		for (int i = 1; i <=n/2 ; i++) {
//			if(n%i==0)
//				sum++;
//		}
//		return sum;
//	}
//}
