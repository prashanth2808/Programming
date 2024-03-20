package com.jsp.programming;

import java.util.Scanner;

public class Negativetopositive {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		int sum = 0 ;
		if(n<0)
		{
		sum=n*(-1);
		System.out.println(" answer is "+sum);
		}
		else if (n>0) {
			
			System.out.println("answer is "+n);
		}
		}

	
}
