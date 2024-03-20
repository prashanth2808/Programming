package com.jsp.stringprograms;

import java.util.Scanner;

public class Indextocharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index : ");
		int i=sc.nextInt();
		char[] ch = new char[128];
		if(i>127)
			System.out.println("invalid");
		else
			System.out.println(i+"------>"+(char)(i));
	}
}


