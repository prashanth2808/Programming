package com.jsp.stringprograms;

import java.util.Arrays;

public class Pangramwithfrequency {
	public static void main(String[] args) {
		Mainstring ms = new Mainstring();
		String st = ms.readinput();
		boolean rs = pangramwithfreq(st);
		if(rs)
			System.out.println("pangram");
		else
			System.out.println("not pangram");
	}
 	static boolean pangramwithfreq(String st)
	{
		String str = st.toUpperCase();
		char[] ch = str.toCharArray();
		int[] count = new int[26];
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='A' && ch[i]<='Z')
				count[ch[i]-65]++;
		}
		for (int i = 0; i < count.length; i++) 
		{
			if(count[i]==0)
				return false;
			System.out.println(count[i]+" times present "+(char)(i+65));
		}
		return true; 


	}
}
