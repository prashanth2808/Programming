package com.jsp.programming;

import java.util.Scanner;

//sum must be equal to the product acc to the given conditions

public class Specialnumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of n");
	int n =sc.nextInt();
	boolean rs =isspecial(n);
	if (rs==true)
	System.out.println(n+" is a special number");
	else
	System.out.println(n+" is not a special number");
	
}

 static boolean isspecial(int n) {
	
	 	 int d1=n/10;
		 int d2=n%10;
		//sum must be equal to the product acc to the given conditions

		 int sum =d1+d2+d1*d2;
		 return sum==n;
 
}
}
