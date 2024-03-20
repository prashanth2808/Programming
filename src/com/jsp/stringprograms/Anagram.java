package com.jsp.stringprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
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

	static boolean anagram(String st1,String st2) 
	{
		String s1 = st1.toLowerCase();
		String s2 = st2.toLowerCase();

		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();

		int[] ch1 = countfrequency1(c1);
		int[] ch2 = countfrequency2(c2);


		for (int i = 0; i < 26; i++) 
		{						
			if(ch1[i]!=ch2[i]) 
				return false;
		}
		return true;
	}


	static int[] countfrequency1(char[] c1) 
	{

		int[] count= new int[26];
		for (int i = 0; i <c1.length; i++)
		{
			if (c1[i] >='a' && c1[i]<='z')
			{
				count[c1[i]-97]++;
			}
		}

		return count;
	}

	static int[] countfrequency2(char[] c2) 
	{

		int[] count= new int[26];
		for (int i = 0; i <c2.length; i++)
		{
			if (c2[i] >='a' && c2[i]<='z')
			{
				count[c2[i]-97]++;
			}
		}

		return count;
	}
}

