package com.jsp.programming;

import java.util.Scanner;

public class Fourdigitsxyleumno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("4 digits xyleum numbers are");
		for(int p=100;p<=1000;p++)
		{
			boolean rs = xyleum(p);
			if(rs)
				System.out.println(p);
		}
	}

	static boolean xyleum(int p)
	{
		int ec=0;
		int mc=0;
		int temp=p;
		do {
			int d=p%10;
			if(temp==p||d==p)
				ec+=d;
			else
				mc+=d;
			p=p/10;
		} while (p!=0);
		if(ec==mc)
			return true;
		else
			return false;

	}
}

