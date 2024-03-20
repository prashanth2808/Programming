package com.jsp.stringprograms;

public class Frequencyofeachcharinstring {
	public static void main(String[] args) {
		Mainstring ms = new Mainstring();
		String st = ms.readinput();
		frequencyofeachcharinstring(st);
	}

	static void frequencyofeachcharinstring(String st) 
	{

		char[] ch = st.toCharArray();		
		int count[]=new int[128];
		for (int i = 0; i < ch.length; i++)
		{
			count[ch[i]]++;

		}
		for (int i = 0; i < count.length; i++)
		{
			if(count[i]!=0)
			{
				System.out.println((char)i+" present "+count[i]);
			}
		}
	}
}

