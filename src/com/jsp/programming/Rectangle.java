package com.jsp.programming;

import java.util.Scanner;

public class Rectangle {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of length and breadth");
	int l =sc.nextInt();
	int b =sc.nextInt();
	int a =areaofrec(l,b);
	System.out.println(a);
}

 static int areaofrec(int l, int b) {

 int sum=l*b;
 return sum;
 }
	
	
}
