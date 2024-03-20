package com.jsp.programmingmoderate;

import java.util.Scanner;

public class Ducknumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s =sc.nextLine();
		boolean rs=isducknum(s);
		if(rs)
			System.out.println(rs);
	}


	static boolean isducknum(String s)
	{
		int c=0;
		if(s.charAt(0)=='0')

			return false;
		for (int i =s.length()-1;i>0; i--) {
			if (s.charAt(i)=='0'&&s.charAt(i-1)=='0') 
				return false;
			if (s.charAt(i)=='0')
				c++;
			return c>=1;
		}
		return true;
	}
}
