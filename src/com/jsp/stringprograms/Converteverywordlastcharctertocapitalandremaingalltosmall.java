package com.jsp.stringprograms;

public class Converteverywordlastcharctertocapitalandremaingalltosmall {
	public static void main(String[] args) {
		Mainstring ms = new Mainstring();
		String rs = ms.readinput();
		String ss = converteverywordlastcharctertocapitalandremaingalltosmall(rs);
		System.out.println(ss);
	}

	static String converteverywordlastcharctertocapitalandremaingalltosmall(String st) {

char[] ch = st.toCharArray();

		for (int i = 0; i < ch.length; i++) 
		{
			if( i==ch.length-1  && ch[i]!=' '  || ch[i]!=' ' &&  ch[i+1]==' ')	
			{
				if(ch[i]>='a'&& ch[i]<='z')
					ch[i]=(char)ch[i-32];
			}
			else
				if(ch[i]>='A'&& ch[i]<='Z')
					ch[i]=(char)ch[i+32];
		}

		return new String(ch);
	}
}

