package com.jsp.programmingmoderate;

import java.util.Scanner;

public class Neonnumberwithinn {
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.err.println("Enter the numbers");
			for (int i = 1; i <=1000; i++) {
				boolean rs = neon(i);
				if(rs)
					System.out.println(i);

			}
		}


		static boolean neon(int n) {
			return n==sumofdigits(n*n);
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
	}


