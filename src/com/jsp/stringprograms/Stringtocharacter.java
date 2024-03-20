package com.jsp.stringprograms;

public class Stringtocharacter {
	public static void main(String[] args) {
		Mainstring ms= new Mainstring();
		String st = ms.readinput();
		stringtocharacter(st);
	}

	static void stringtocharacter(String st)
	{
		for (int i = 0; i < st.length(); i++) 
		{
			char[] ch = st.toCharArray();
			System.out.println(ch[i]);
		}

	}
}

//static void stringtocharacter(String st)
//{
//	int i=0,j=st.length();
//	while (i<j) 
//	{
//		char[] ch = st.toCharArray();
//		System.out.println(ch[i]);
//		i++;
//	}