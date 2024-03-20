package com.jsp.stringprograms;

import java.util.Scanner;

public class Capitalandsmalllerttersinthestring {
	public static void main(String[] args) {
		Scanner sc =new  Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = sc.nextLine();
		int uc=0;
		int lc=0;
		int dc=0;
		int spc=0;
		for (int i = 0; i < s1.length(); i++)
		{
			char ch= s1.charAt(i);
			if(ch >= 65 && ch <= 90) 
				uc++;
			else if (ch >=97 && ch <=122)
				lc++;	
			else if(ch>='0' && ch<='9')
				dc++;
			else
				spc++;
		}
		System.out.println("Capital letters: "+uc);
		System.out.println("Small letters: "+lc);
		System.out.println("Digits: "+dc);
		System.out.println("Special characters: "+spc);

	}
}
