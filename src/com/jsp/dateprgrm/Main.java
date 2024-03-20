package com.jsp.dateprgrm;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the first date");

		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yy=sc.nextInt();

		Date dt = new Date(dd, mm, yy);


		System.out.println("Enter the second date");
		int d1=sc.nextInt();
		int m1=sc.nextInt();
		int y1=sc.nextInt();
		
		Date dt1= new Date(d1, m1, y1);
		
		int x=dt.countdays();
		int y=dt1.countdays();
		
		System.out.println("number of days b/w "+dt+"and"+dt1+"is :"+(y-x));
				
		
		System.out.println("day name of"+dt+"is"+dt.getdayname());
		System.out.println("day name of"+dt1+"is"+dt1.getdayname());

	}
}
