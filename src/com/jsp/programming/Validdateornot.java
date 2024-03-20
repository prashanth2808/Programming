package com.jsp.programming;

import java.util.Scanner;

public class Validdateornot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the date:");
		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yy=sc.nextInt();
		System.out.print(+dd +"/"+mm+"/"+yy);
		String ss =validdate(dd, yy, mm);
		System.out.println(ss);

	}



	static String validdate(int dd,int yy,int mm)
	{

		if(dd<1||dd>31||mm<1||mm>12||yy<1)//31
			return "invalid";
		else if (dd>30&&(mm==4||mm==6||mm==9||mm==11)) 
			return "invalid";
		else if ( dd>29 && mm==2  ) 
			return "invalid";
		else if ((yy%4==0 && yy%100!=0||yy % 400==0)==false && dd>28 && mm==2) 
			return "invalid";
		else 
			return "valid";

	}

}


