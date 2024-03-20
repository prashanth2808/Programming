package com.jsp.arraysprgmsmodrate;

public class Frequencyofhiggestnumberinarray {
	public static void main(String[] args) {
		Mainarray ma = new Mainarray();
		int[] rs = ma.readinput();
		frequencyofhiggestnumberinarray(rs);
	}


// only for positive numbers
	
	 static void frequencyofhiggestnumberinarray(int[] x) {
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
		for (int i = 0; i < x.length; i++) {
			if(count[x[i]]!=0)
			{
				System.out.println(x[i]+"------>"+count[x[i]]);
			}
		}

	}
}

//method for +ve and -ve nummbers
// static void frequencyofhiggestnumberinarray(int[] x) {
//
//		int n=x.length;
//
//		for (int i = 0; i < n; i++) 
//		{
//			int count=1;
//			for (int j = i+1; j < n; j++)
//			{
//				if (x[i]==x[j])
//				{
//					count++;
//					x[j]=x[n-1];
//					n--;
//					j--;
//
//				}
//			}
//System.out.println(x[i]+"  is  present "+count+" times");
//		}
//
//	}
//}
