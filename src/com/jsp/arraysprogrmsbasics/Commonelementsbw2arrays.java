package com.jsp.arraysprogrmsbasics;

public class Commonelementsbw2arrays {
	public static void main(String[] args) {

	}
 static int[] intersection(int[] x,int[] y)
	{
		int[] t= new int[x.length];
		int k=0;
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j < y.length; j++)
			{
				if(x[i]==y[j])
				{
					t[k++]=x[i];
					break;
				}
			}
		}
		int[] rs=new int[k];
		for (int i = 0; i <k; i++) {

			rs[i]=t[i];
		}
		return rs;
	}

}
