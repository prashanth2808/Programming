package com.jsp.stringprograms;

public class Swapeveryword1stcharandsamewordlastchar {
	public static void main(String[] args) {
		Mainstring ms = new Mainstring();
		String str = ms.readinput();
		String st = Swapeveryword1stcharandsamewordlastchar(str);
		System.out.println(st);

	}

	static String Swapeveryword1stcharandsamewordlastchar(String str) {
		char[] ch = str.toCharArray();
		int f=0;
		for (int i = 0; i < ch.length; i++) 
		{
			if(i==0 && ch[i]!=' ' || ch[i]!=' '&& ch[i-1]==' ' )
				f=i;	
			else if(i==ch.length-1 && ch[i]!=' '|| ch[i]!=' ' && ch[i+1]==' ')
			{
				char temp=ch[f];
				ch[f]=ch[i];
				ch[i]=temp;
			}
		}
		return new String(ch);
	}
}