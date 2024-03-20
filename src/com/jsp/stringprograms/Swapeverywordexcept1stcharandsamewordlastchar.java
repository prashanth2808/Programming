package com.jsp.stringprograms;

public class Swapeverywordexcept1stcharandsamewordlastchar {
	public static void main(String[] args) {
		Mainstring ms = new  Mainstring();
		String st = ms.readinput();
		String str = Swapeverywordexcept1stcharandsamewordlastchar(st);
		System.out.println(str);
	}

	static String Swapeverywordexcept1stcharandsamewordlastchar(String st) 
	{


		char[] ch = st.toCharArray();
		int f=0;
		for (int i = 0; i < ch.length; i++) 
		{
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
				f=ch[i];

			else if(i==ch.length-1 && ch[i]!=' ' || ch[i]!=' ' && ch[i+1]==' ')
			{
				
			}
		}
	}
}