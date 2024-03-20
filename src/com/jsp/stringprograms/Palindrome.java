package com.jsp.stringprograms;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args)
	{
		Mainstring ms = new Mainstring();
		String st = ms.readinput();
		boolean rs = palindrom(st);
		
		
		if(rs) 
			System.out.println(rs);
		else
			System.out.println(rs);
	}
	static boolean palindrom(String st)
	{
		int i=0,j=st.length()-1;

		while ( i<j ) 
		{
			if(st.charAt(i)!=st.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}


