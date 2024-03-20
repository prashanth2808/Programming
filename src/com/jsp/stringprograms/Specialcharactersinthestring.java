package com.jsp.stringprograms;

public class Specialcharactersinthestring {
	public static void main(String[] args) {
		Mainstring ms = new Mainstring();
		String st = ms.readinput();
		specialchar(st);
	}

	static void specialchar(String st)
	{
		int spc=0;
		int ca=0;
		int dc=0;

		char[] ch = st.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			if(ch[i]>='A'&& ch[i]<='Z') 
				ca++;
			else if(ch[i]>='a' && ch[i]<='z')
				ca++;
			else if(ch[i]>='0' && ch[i]<='9')
			dc++;
			else
				spc++;
		}
//		System.out.println("Alphabets in the string: "+ca);
//		System.out.println("Numbers in the string: "+dc);
		System.out.println("Special characters in the string: "+spc);
	}

}
