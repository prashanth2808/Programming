package com.jsp.arraysprogrmsbasics;

import java.util.Arrays;

public class Unionofarray {
	public static void main(String[] args) {
		Mainarray ma = new Mainarray();
		int[] a = ma.readinput();
		int[] b = ma.readinput();
		int[] is = union(a,b);
		System.out.println("Union: ");
		System.out.println(Arrays.toString(is));

	}

	static  int[] union(int[] x,int[] y)
	{
		int[] t =new int[x.length + y.length];
		for (int i = 0; i < x.length; i++)
		{
			t[i]=x[i];	
		}
		int k=x.length;
		for (int i = 0; i < y.length; i++) {
			boolean rs=true;
			for (int j = 0; j < x.length; j++) {
				if(y[i]==x[j])
				{
					rs=false;
					break;
				}
			}
			if(rs)
				t[k++]=y[i];
		}
		int[] rs= new  int[k];
		for (int i = 0; i < k; i++) {
			rs[i]=t[i];
		}
		return rs;
	}

}
