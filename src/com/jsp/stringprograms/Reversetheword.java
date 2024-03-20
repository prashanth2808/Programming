package com.jsp.stringprograms;

public class Reversetheword {
	public static void main(String[] args) {
		Mainstring ms = new Mainstring();
		String st = ms.readinput();
		String ss = revtheword(st);
		System.out.println(ss);

	}

	static String revtheword(String st) 
	{
		char[] ch = st.toCharArray();	
		String rs="";
		for (int i = 0; i < ch.length; i++)
		{
			int f=i;

			while(i<ch.length && ch[i]!=' ')
				i++;

			int l=i-1;

			while(l>=f)
			{
				rs=rs+ch[i];
				l--;

			}
			if(i<ch.length)
				rs=rs+ch[i];

		}
		return rs;
	}
}
