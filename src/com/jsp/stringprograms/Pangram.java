package com.jsp.stringprograms;

public class Pangram {
	public static void main(String[] args) {
		Mainstring ms =new Mainstring(); 
		String st = ms.readinput();
		boolean rs = pangram(st);
		if(rs)
			System.out.println("is pangram  "+rs);
		else
			System.out.println("not pangram");
	}
	static boolean pangram(String st) 
	{
		int[] count = new int[26];
		char[] ch = st.toCharArray();
		//		if(st.length()<26)
		//			return false;

		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='A' && ch[i]<='Z')
				count[ch[i]-65]++;
			else if(ch[i]>='a' && ch[i]<='z')
				count[ch[i]-97]++;

		}
		for(int i=0;i<26;i++)
		{
			if(count[i]==0)
				return false;
		}
		return true;
	}

}
