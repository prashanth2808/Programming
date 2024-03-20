package com.jsp.programming;

import java.util.Scanner;

public class Circle {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of radius ");
	int r =sc.nextInt();
	double d = radius(r);
	System.out.println(d+ " is the area of a cirlce");
		
}

 static double radius(int r) {
	 
		double d =3.14*r*r; 
		return d;

}
}
