package com.jsp.arraysprgmsmodrate;

public class Highestoccuredelementinarray {
	public static void main(String[] args) {
		Mainarray ma = new Mainarray();
		int[] rs = ma.readinput();
		highestoccuredelementinarray(rs);

	}
	static void highestoccuredelementinarray(int[] x) {
		int big=x[0];
		for (int i = 1; i < x.length; i++) 
		{
			if(x[i]>big)
				big=x[i];
		}

		int[] count= new int[big+1];
		for (int i = 0; i < x.length; i++) {
			count[x[i]]++;
		}
		int mi=0;
		
		for (int i = 1; i < count.length; i++) 
		{
			if(count[i]>count[mi])
			{
				mi=i;

			}
		}			System.out.println(mi);

	}
}
