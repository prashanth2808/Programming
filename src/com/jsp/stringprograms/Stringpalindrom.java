package com.jsp.stringprograms;

import java.util.Scanner;

public class Stringpalindrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string 1");
		String s1 = sc.nextLine();
		boolean rs = Stringpalindrom(s1);
		if(rs)
			System.out.println("palindrome possible");
		else
			System.out.println("palindrome not possible");



	}

	static boolean Stringpalindrom(String s1)
	{

		if(s1.length()<2)
			return true;
		int[] count = new int[26];
		s1 = s1.toLowerCase();
		for (int i = 0; i < s1.length(); i++)
		{
			count[s1.charAt(i)-97]++;
		}

		int oc=0;
		for (int i = 0; i < 26; i++) 
		{
			if(count[i] % 2==1)
				oc++;
			if(oc>1)
				return false;
		}
		return true;
	}
}
