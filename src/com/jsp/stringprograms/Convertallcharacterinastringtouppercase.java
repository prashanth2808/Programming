package com.jsp.stringprograms;

public class Convertallcharacterinastringtouppercase {
	public static void main(String[] args) {
		Mainstring ms = new Mainstring();
		String rs = ms.readinput();
		String string = conversion(rs);
		System.out.println(string);
	}

	static String conversion(String st)
	{
		char[] ch =st.toCharArray();//  to store a string into character array

		for (int i = 0; i < ch.length; i++)
		{
			if(ch[i]>='a'&&ch[i]<='z')
				ch[i]=(char) (ch[i]-32);

		}

		String ss = new String(ch);  // to convert character into string
		return ss;

	}


}
