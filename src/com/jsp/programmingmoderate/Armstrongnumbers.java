package com.jsp.programmingmoderate;

import java.util.Scanner;

public class Armstrongnumbers {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n =sc.nextInt();
		boolean i = isArmstrong(n);
		System.out.println(i);
	}

	static boolean isArmstrong(int n)   
	{   		
		int temp=n;
	int p=countnum(n);
	int sum=0;


	do { 
		int d =n%10;
		sum=sum+pow(d,p);
		n=n/10;
	} while (n!=0);
	return sum==temp;
	}

	static int pow(int n, int p) {

		int prod=1;
		while(p>0)
		{
			prod=prod*n;
			p--;
		}
		return prod;

	}

	static int countnum(int n) {
		int count=0;
		do {
			count++;
			n=n/10;
		}while(n!=0);

		return count;
	}
}

//p--; deseriumnum
