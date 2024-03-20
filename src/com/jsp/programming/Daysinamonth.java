package com.jsp.programming;

import java.util.Scanner;

public class Daysinamonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month to find the date");
		int mm=sc.nextInt();
		int rs = monthno(mm);
		System.out.println(rs+" days");
	}

	static int monthno(int mm) {
		if(mm==4||mm==6||mm==9||mm==11)
			return 30;
		else if (mm==1||mm==3||mm==5||mm==7||mm==8||mm==10||mm==12)
			return 31;
		else if(mm==2)
			return 28;
		
		else
			return 0;



	}
}
