package com.jsp.programming;

import java.util.Scanner;

public class positiveornegetiveinarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of arrays");
		int size=sc.nextInt();
		int[] ar = new int[size];
		System.out.println("Enter the array values:");
		for (int i = 0; i < size; i++) {
			ar[i]=sc.nextInt();
		}
		num(ar);
	}
	static void num(int[] ar) {
		for (int i = 0; i < ar.length; i++) {

			if( ar[i] > 0)
			{
				System.out.println("is a positive no");
			}
			else 
			{
				System.out.println("is a negetive no");
			}
		}
	}
}