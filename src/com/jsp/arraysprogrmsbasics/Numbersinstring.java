package com.jsp.arraysprogrmsbasics;

import com.jsp.stringprograms.Mainstring;

public class Numbersinstring {
	public static void main(String[] args) {
		Mainstring ms=new Mainstring();
		String rs = ms.readinput();
		numbersinstring(rs);

	}

	private static void numbersinstring(String st)
	{
		String str = st.toLowerCase();
		char[] ch = str.toCharArray();
		int sum=0;
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>48 && ch[i]<59)
				sum+=ch[i]-48;
		}
		System.out.println(sum);
	}
}
