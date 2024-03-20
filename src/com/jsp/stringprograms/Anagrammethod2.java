package com.jsp.stringprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrammethod2 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the string 1 :");
		String s1= sc.nextLine();
		System.out.println("Enter the string 2 :");
		String s2= sc.nextLine();
		boolean rs = anagram(s1,s2);
		if(rs)
			System.out.println("anagram");
		else
			System.out.println("not anagram");
	}

	private static boolean anagram(String s1, String s2) {

		s1=s1.replace(" ","");
		s2=s2.replace(" ","");

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();


		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);
	}
}
