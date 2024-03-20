package com.jsp.stringprograms;

import java.util.Scanner;

public class Mainstring 
{
	public static void main(String[] args) 
	{
		String string = readinput();
		System.out.println(string);
	}
	public static String readinput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s1=sc.nextLine();
		return s1;

	}

}
