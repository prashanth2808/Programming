package com.jsp.stringprograms;

import java.util.Arrays;
import java.util.HashSet;

public class Indexofaword {
	public static void main(String[] args) {
		Mainstring ms = new Mainstring();
		String st = ms.readinput();
		Indexofaword(st);
	}

	static void Indexofaword(String st) 
	{

		HashSet<Character> hs = new HashSet<Character>();
		st=st.toLowerCase();

		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);

			if(hs.add(ch))
			{				
				System.out.print(ch+"------>");
				int in = st.indexOf(ch);

				while(in>=0)
				{
					System.out.print(in+1+" ,");
					in=st.indexOf(ch, in+1);
				}
				System.out.println();
			}
		}
	}
}
