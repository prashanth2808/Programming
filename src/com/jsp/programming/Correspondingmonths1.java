package com.jsp.programming;

import java.util.Scanner;

public class Correspondingmonths1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the month number");
		int mm=sc.nextInt(); 
		String st = month(mm);
		System.out.println(st);
	}

	static String month(int mm) {
		if(mm==1)
			return "jan";
		else if(mm==2)
			return "feb";
		else if(mm==3)
			return "march";
		else if(mm==4)
			return "april";
		else if(mm==5)
			return "may";
		else if(mm==6)
			return "june";
		else if(mm==7)
			return "july";
		else if(mm==8)
			return "aug";
		else if(mm==9)
			return "sep";
		else if(mm==10)
			return "oct";
		else if(mm==11)
			return "nov";
		else if(mm==12)
			return "dec";
		else 
			return "invlaid";

	}

}
