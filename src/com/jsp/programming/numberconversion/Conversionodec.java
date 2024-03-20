package com.jsp.programming.numberconversion;

public class Conversionodec {

	public String dectobin(int dec) 
	{
		String s1=" ";
		do {
			int r =dec%2;
			s1=r+s1;
			dec=dec/2;
		} while (dec!=0);
		return s1;
	}

	public String dectooct(int dec) {

		String s1=" ";
		do {
			int r =dec%8;
			s1=r+s1;
			dec=dec/8;
		} while (dec!=0);
		return s1;
	}

	public String dectohex(int dec) {
		String s1 = " ";
		do {
			int r=dec%16;
			if(r<10)
				s1=r+s1;
			else
				s1=(char)(r+55)+s1;
			dec=dec/16;
		} while (dec!=0);
		return s1;

	}
}