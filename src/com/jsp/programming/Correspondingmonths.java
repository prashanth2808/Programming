package com.jsp.programming;

import java.util.Scanner;

public class Correspondingmonths {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month number ");
		int  n=sc.nextInt();
		if(n>=1 && n<=12)
		switch (n) {
		case 1:System.out.println("january");
		break;
		case 2:System.out.println("Feburary");
        break;
		case 3:System.out.println("March");
		break;
		case 4:System.out.println("April");
		break;
		case 5:System.out.println("May");
		break;
		case 6:System.out.println("june");
		break;
		case 7:System.out.println("july");
		break;
		case 8:System.out.println("August");
		break;
		case 9:System.out.println("September");
		break;
		case 10:System.out.println("October");
		break;
		case 11:System.out.println("November");
		break;
		case 12:System.out.println("December");
		break;
				}
		else {
			System.out.println("invalid month");
		}
	}

}
