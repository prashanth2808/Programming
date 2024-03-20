package com.jsp.programmingmoderate;

import java.util.Scanner;

public class Multiplesofthree {
	
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the value of n");
			int n =sc.nextInt();
			int i = multiples(n);
			System.out.println(i);
		}

		static int multiples(int n) {
			int ecount=0;

			do 
			{
				int d =n%10;
				if(d%3==0)
					ecount++;
				n=n/10;
			}	while (n!=0) ;

			return ecount;	
		}
	}

