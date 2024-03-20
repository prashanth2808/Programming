package com.jsp.programmingmoderate;

import java.util.Scanner;

public class Evenorodd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n =sc.nextInt();
		String string = evenodd(n);
		System.out.println(string);


	}

	static String evenodd(int n) {
		int ec=0;int oc=0;

		do {
			int d=n%10;
			if(n%2==0)
				ec++;
			else
				oc++;
			n=n/10;
		}while(n!=0);
			if(ec==oc)
				return "good";
			else
				return "bad";


	}
}

