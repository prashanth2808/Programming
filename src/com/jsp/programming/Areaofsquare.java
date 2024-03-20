package com.jsp.programming;

import java.util.Scanner;

public class Areaofsquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of a square");
		int s = sc.nextInt();
		int i = areaofsq(s);
		System.out.println(i);

	}

	static int areaofsq(int s) {
		int sum =s*s;	
		return sum;
	}
}
