package com.jsp.programmingmoderate;

import java.util.Scanner;

public class Luckynumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dob");
		int dd =sc.nextInt();
		int mm =sc.nextInt();
		int yy =sc.nextInt();

		int i = getluckynum(dd,mm,yy);
		System.out.println(i);
	}

	static int getluckynum(int dd,int mm,int yy) {
		int n=sumofdigits(dd)+sumofdigits(mm)+sumofdigits(yy);
		while(n>9)
		{
			n=sumofdigits(n);

		}
		return n;

	}

	static int sumofdigits(int n) {
		int sum=0;
		do {
			int d =n%10;
			sum+=d;
			n=n/10;

		} while (n!=0);
		return sum;

	}

	static int sumofdigits1(int dd) {
		int sum=0;
		do {
			int d =dd%10;
			sum+=d;
			dd=dd/10;

		} while (dd!=0);
		return sum;

	}
	static int sumofdigits2(int yy) {
		int sum=0;
		do {
			int d =yy%10;
			sum+=d;
			yy=yy/10;

		} while (yy!=0);
		return sum;

	}
	static int sumofdigits3(int mm) {
		int sum=0;
		do {
			int d =mm%10;
			sum+=d;
			mm=mm/10;

		} while (mm!=0);
		return sum;

	}


}
