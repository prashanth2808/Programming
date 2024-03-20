package com.jsp.stringprograms;

import java.util.Scanner;

public class Printthecharacterwithitsindex {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the character:");
		String s1=sc.next();
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(i+"--->"+s1.charAt(i));
		}
	}
}
