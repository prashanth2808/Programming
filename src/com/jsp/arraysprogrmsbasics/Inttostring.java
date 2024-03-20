package com.jsp.arraysprogrmsbasics;

import java.util.Scanner;

public class Inttostring {
	static void nw(int n,String st)
	{
		if(n==0)
			return;
		String[] x= {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eightteen","ninteen","twenty"};
		String[] y= {"","","Twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};


		if(n<20)
			System.out.println(x[n]+" ");
		else
			System.out.println(y[n/10]+x[n%10]+" ");
		System.out.println(st+" ");
	}
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the amount");
			int amt=sc.nextInt();
			nw(amt/10000000,"corer");
			nw(amt/100000%100,"lakh");
			nw(amt/1000%100,"thousand");
			nw(amt/100%10,"hunderd and");
			nw(amt/100/10," ");
		}
	}
