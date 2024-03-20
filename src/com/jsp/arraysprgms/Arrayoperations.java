package com.jsp.arraysprgms;

import java.util.Scanner;

public class Arrayoperations {
int[] readArray()
{
 Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array");
int n=sc.nextInt();
int[] ar= new int[n];
System.out.println("Enter the " +n+" elements");
for(int i=0;i<ar.length;i++)
{
 	ar[n]=sc.nextInt();
}
return ar;
}



int[] merge(int[] a,int[] b)
{
	int[] c=new int[a.length+b.length];
	for(int i=0;i<a.length;i++)
	{
		c[i]=a[i];
	}
	for (int i = 0; i < b.length; i++) {
		c[a.length+i]=b[i];
				
	}
	
	return c;
}
	void dispArray(int[] ar)
	{
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]);
		if(i<ar.length-1)
		{
			System.out.print(",");
		}
		}
	}
}