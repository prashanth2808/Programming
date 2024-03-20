package com.jsp.programmingmoderate;

import java.util.Scanner;

public class Averageofnum {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int n =sc.nextInt();
		int i = avgofnum(n); 
		System.out.println("avg of number:"+i);
	}

	static int avgofnum(int n) {
		return sumofdigits(n)/countofdigits(n);
	}
	
	
	static int sumofdigits(int n) {
		int sum=0;
		do {
			int d=n%10;
			
			sum+=d;
			
			n=n/10;
			
		} while (n!=0);
		
		return sum;
	}
	static int countofdigits(int n) {
		int count=0;
		
		do {
			int d=n%10;
			count++;
			n=n/10;
			
		} while (n!=0);
		
		return count;
	}



}
