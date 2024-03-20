package com.jsp.stringprograms;

public class Longestwordfromthesentences {
	public static void main(String[] args) {
		Mainstring ms = new Mainstring();
		String st= ms.readinput();
		String rs = getlongestword(st);
		System.out.println("longest word :"+rs);
	}

	private static String getlongestword(String st)
	{
		String bw="",w="";
		st=st+' ';
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if(ch==' ')
			{
				if(w.length()>bw.length())
					bw=w;
				w="";
			}
			else
				w=w+ch;
		}
		return bw;
	}
}
