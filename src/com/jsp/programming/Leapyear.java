package com.jsp.programming;

import java.util.Scanner;

public class Leapyear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year to find leap year");
		int yy =sc.nextInt();
		boolean rs=leapyear(yy);
		if(rs==true)
			System.out.println(yy+" is a leap year");
		else
			System.out.println(yy+" is not a leap year");

	}
	static	boolean leapyear(int yy) {

		if(yy%4==0 && yy%100!=0 || yy%400==0)
		return true;
		return false;
	}
}