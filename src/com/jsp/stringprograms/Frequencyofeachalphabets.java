package com.jsp.stringprograms;

public class Frequencyofeachalphabets {
	public static void main(String[] args) {
		Mainstring ms = new Mainstring();
		String st = ms.readinput();
		frequencyofeachalphabets(st);
	}

	static void frequencyofeachalphabets(String st) 
	{

		int[] count = new int[26];
		char[] ch =st.toCharArray();

		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='A' && ch[i]<='Z')
				count[ch[i]-65]++;

			System.out.println(ch[i]);
		}
		for (int i = 0; i < count.length; i++)
		{
			if(count[i]!=0)
			{
				System.out.println((char)(i+65)+" present "+count[i]);
			}
		}

	}

}
