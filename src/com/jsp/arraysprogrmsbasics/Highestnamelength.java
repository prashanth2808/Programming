package com.jsp.arraysprogrmsbasics;

import java.util.Scanner;

public class Highestnamelength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of names to be stored:");
		int n =sc.nextInt();
		System.out.println("Enter "+n+" names");
		String[] ar = new String[n];
		for (int i = 0; i <ar.length; i++) {
		ar[i]=sc.nextLine();	
		}
		String string = name(ar);
		System.out.println(string);
	}

	 static String name(String[] x) 
	{
		String temp="";
		for (int i = 0; i <	x.length; i++)
		{
			if(temp.length()<x[i].length())
			temp=x[i];
		}
		return temp;
	}

}
