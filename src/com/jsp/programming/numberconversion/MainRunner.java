package com.jsp.programming.numberconversion;

import java.util.Scanner;

public class MainRunner {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Conversionodec con = new Conversionodec();
		System.err.println("Enter the decimal to convert:");
		int dec=sc.nextInt();


		String bin=con.dectobin( dec);
		System.out.println("Binary:"+bin);

		String oct = con.dectooct(dec);
		System.out.println("oct:"+oct);

		String hex=con.dectohex( dec);
		System.out.println("hexa:"+hex);


	}
}