package com.jsp.stringprograms;

public class Convertstringtolowercase {
	public static void main(String[] args) {
		Mainstring ms =  new Mainstring();
		String st = ms.readinput();
		String string = lowercase(st);
		System.out.println("Output: "+string);
	}

	static String lowercase(String st) 
	{
		char[] ch = st.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			ch[i] =(char)(ch[i]+32);
		}   String ss = new String(ch);

		return ss;
	}
}


