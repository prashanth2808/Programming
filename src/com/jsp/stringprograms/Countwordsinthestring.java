package com.jsp.stringprograms;

public class Countwordsinthestring {
	public static void main(String[] args) {
		Mainstring ms = new Mainstring();
		String st = ms.readinput();
		countwordsinthestring(st);
	}

	static void countwordsinthestring(String st) 
	{	
		   
		
		
		
		
		char ch[]=st.toCharArray();
		int count=0;
		for (int i = 0; i < st.length(); i++) 
		{
			if((i==0&&ch[i]!=' ')||(ch[i]!=' '&& ch[i-1]==' '))		
				count++;
		}
		System.out.print(count+"total count"); 	

	}
}


