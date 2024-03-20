package com.jsp.programming;

import java.util.Scanner;

//public class Smallestamongthree {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the 3 numbers");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//
//		if(a<b && a<c)
//			System.out.println(a+" is smallest among 3 ");
//		else if ( b<a && b<c) 
//			System.out.println(b+" is smallest");
//		else 
//			System.out.println( c+" is smallest");
//
//	}
//}


//getmiddle value
public class Smallestamongthree
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three number");
		int a = sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();

		int ss = middlevalue(a,b,c);
		System.out.println("mid value is "+ss);



	}

	static int middlevalue(int a, int b, int c) {
 
		int max =(a>b && a>c)? a : (b>c)?b:c;
		int min =(a<b && a<c)? a  :  (b<c)?b:c;
		return (a+b+c)-(min+max);


	}
}




//DAMT return true if the year is leap year else false
//DAMT to receive the month no and return how many days in the month number if it is a invalid 0 for feb u can return 29 or 28
//DAMT receive a month number and return corresponding month name.
//DAMT return area of a circle 
//DAMT return the area of a rectangle 
//DAMT return the area of a square 
//DAMT return factorial of n.
//DAMT return biggest among three double values
//WAJP to take 4sub marks of a student and return result like fail,distinct,first class,second class or pass.
//DAMT return to take one integer value return sanju if the no is divisible by 3, return geeta if number is divisible by 5 ,return sunju weds geeta if number is divisible by both 3 n 5 other wise return breakup.