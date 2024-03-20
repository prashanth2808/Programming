package com.jsp.stringprograms;

import java.util.Scanner;

public class readMultiplecharectres 
{
	public static void main(String[] args)
	{
	     Scanner sc=new Scanner(System.in);
	     while(true) {
	     System.out.println("enter the charectre");
	     System.out.println(sc.next().charAt(0));
	     System.out.println("do you want to read more chars");
	     String s=sc.next();
	     if(s.equals("no"))
	    	 break;
	     }
		
	}

}
