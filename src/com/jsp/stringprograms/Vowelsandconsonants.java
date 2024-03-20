package com.jsp.stringprograms;

public class Vowelsandconsonants {

	public static void main(String[] args) {
		Mainstring ms = new  Mainstring();
		String rs = ms.readinput();
		consonantsandvowels(rs);

	}

	static void consonantsandvowels(String st) 
	{
		int v=0,cc=0;

		for (int i = 0; i < st.length(); i++) {

			char c = st.charAt(i);
			if(c>='A'|| c<='Z'||c>='a'||c<='z')
			{
				if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
					v++;			
				else
					cc++;

			}
		}
		System.out.println(v);
		System.out.println(cc);

	}
}
