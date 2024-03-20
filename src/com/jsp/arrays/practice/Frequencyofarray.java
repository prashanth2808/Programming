package com.jsp.arrays.practice;

import java.util.Scanner;

public class Frequencyofarray {
public static void main(String[] args) {
	Scanner sc = new  Scanner(System.in);
	System.out.println("Enter the size of an array");
int n=sc.nextInt();
int []ar=new int[n];
System.out.println("Enter the "+n+" values");
for (int i = 0; i < ar.length; i++) {
	ar[i]=sc.nextInt();
}
boolean b 
= freqofarr(ar);
System.out.println(ar);
}

 static boolean freqofarr(int[] x) {

	for (int i = 0; i < x.length; i++) {
		if(x[i]==false)
		{
		int c=0;
		for (int j = i; j < x.length; j++) {
			if(x[i]==x[j])
			{c++;
			x[j]=true;
			}
		}
		System.out.println(x[i]+"present :"+c+" times");
		}
		
	}

	
}
}
