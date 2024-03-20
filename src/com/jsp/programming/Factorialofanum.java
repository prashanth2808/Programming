package com.jsp.programming;


import java.util.Scanner;

public class Factorialofanum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
	    int n =sc.nextInt();
	    int i = fact(n);
	    System.out.println(i);
	
	}

	 static int fact(int n) {
		 int fact = 1;
		 while (n>1)
		 {
			 fact =fact*n;
			 n--;
		 }
			
	
		return fact;
		
	}

}
