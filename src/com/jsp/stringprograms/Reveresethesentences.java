package com.jsp.stringprograms;

public class Reveresethesentences {
	public static void main(String[] args) {
		Mainstring ms =  new Mainstring();
		String st = ms.readinput();
		String str = Reveresethesentences(st);
		System.out.println(str);
	}

	static String Reveresethesentences(String st)

	{

		char[] ch =st.toCharArray();
		String rs ="";
		for (int i = ch.length-1; i >=0 ; i--) {
			int l = i;

			while(i>=0 && ch[i]!=' ')
				i--;
			int f=i+1;
			while(l>=f)
			{
				rs=rs+ch[f];
				f++;
			}
			if(i>=0)
				rs=rs+ch[i];
		}
		return rs;
	}
}
