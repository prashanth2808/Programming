package com.jsp.programming;

import java.util.Scanner;

public class Sanjuandgeeta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be divided:");
		int n =sc.nextInt();
		String st =msg(n);
		System.out.println(st);

	}

	static String msg(int n ) {
		
		 if (n%3==0 && n%5==0)
			return "sanju weds geeta";
		else if (n%5==0)
			return "geeta";
		else if(n%3==0)
			return"sanju";
		
		else
			return "breakup";
	}

}
