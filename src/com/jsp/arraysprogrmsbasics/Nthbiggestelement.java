package com.jsp.arraysprogrmsbasics;

public class Nthbiggestelement {
	public static void main(String[] args) {
		Mainarray ma = new Mainarray();
		int[] rs = ma.readinput();
		int i = nthbiggestelement(rs,3);
		System.out.println(i);

	}

	static  int  nthbiggestelement(int[] x,int n) 
	{
		int count=0;
		for (int i = 0; i < x.length; i++)
		{

			for (int j = 0; j < x.length; j++)
			{
				if (x[j]>x[i])
					count++;	
			}
			if(count==n-1)
				return x[i];
		}
	
	return 0;

}
}
