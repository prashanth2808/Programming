package com.jsp.arraysprogrmsbasics;

public class Biggestelementofanarray {
public static void main(String[] args) {
	Mainarray ma = new Mainarray();
	int[] rs = ma.readinput();
	int i = biggestnumber(rs);
	System.out.println(i+" is the biggest");
}

static int biggestnumber(int[] x) {
	int big=0;
for (int i = 0; i < x.length; i++) {
	
	if(big<x[i])
	{
		big=x[i];
	}
}
return big;	
}
}
