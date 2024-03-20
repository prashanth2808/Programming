package com.jsp.programming;

import java.util.Scanner;

public class Correspondingdays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day");
	int n=sc.nextInt();
	
	if(n>=1 && n<=7)
		switch (n) {
		case 1:System.out.println("Sunday");
		break;
		case 2:System.out.println("Monday");
		break;
		case 3:System.out.println("Tueday");
		break;
		case 4:System.out.println("Wednesday");
		break;
		case 5:System.out.println("Thursday");
		break;
		case 6:System.out.println("Friday");
		break;
		case 7:System.out.println("Saturday");
		break;
	}
	else 
		System.out.println("Invalid day");
	
	}

}
