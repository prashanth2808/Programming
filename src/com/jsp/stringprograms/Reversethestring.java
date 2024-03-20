package com.jsp.stringprograms;

import java.util.Scanner;

public class Reversethestring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of string ");
		String st=sc.nextLine();
		//String rs = reverse(st);
		String rs =efficientcodeofreverse(st);
		System.out.println(rs);
	}

	//	 static String reverse(String st) {
	//		String rev="";
	//		for(int i=st.length()-1;i>=0;i--)
	//		{
	//			rev=rev+st.charAt(i);
	//		}
	//		return rev;


	static String efficientcodeofreverse(String st)
	{
		char[] ch=st.toCharArray();
		int i=0,j=ch.length-1;

		while (i<j) 
		{
			char t =ch[i];
			ch[i]=ch[j];
			ch[j]=t;
			i++;
			j--;

		}
		String ss = new String(ch);//in built array method to convert character array to string.
		return ss;

	}



}