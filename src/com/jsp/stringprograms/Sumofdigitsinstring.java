package com.jsp.stringprograms;

public class Sumofdigitsinstring {
	public static void main(String[] args) {
		Mainstring ms = new Mainstring();
		String rs = ms.readinput();
		sumofstring(rs);	

	}

	static void sumofstring(String st)
	{
		char[] ch = st.toCharArray();
		int sum=0;
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>=48 && ch[i]<=57)
				sum=sum+(ch[i]-48);
		}		
		System.out.println("Sum of the string : "+sum);
	}
}
