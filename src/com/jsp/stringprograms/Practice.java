package com.jsp.stringprograms;

import java.util.Arrays;

public class Practice {
	public static void main(String[] args) {
		Mainstring ms = new Mainstring();
		String st = ms.readinput();
		boolean rs = pangram(st);
		if(rs)
			System.out.println("pangram");
		else
			System.out.println("not pangram");
	}

	static boolean pangram(String st) 
	{
		char[] ch = st.toCharArray();		
		int[] count= new int[26];
		for (int i = 0; i < ch.length; i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
				count[ch[i]-65]++;
		}
		for (int i = 0; i < count.length; i++) 
		{
			
				System.out.println(count[i]+ "present of" +(char)(i+65));
				if(count[i]==0)

			return false;
		}
		return true;
	}
}

