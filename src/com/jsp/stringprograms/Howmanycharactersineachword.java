package com.jsp.stringprograms;

import java.util.Scanner;

public class Howmanycharactersineachword {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String st = sc.nextLine();
		charinaword(st);
	}
	static void charinaword(String st)
	{
		int count=0;
		String stt = st.replace(" ","");
		char[] ch = stt.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			count++;
		}	
		System.out.println(count);
	}
}
