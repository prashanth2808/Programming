package com.jsp.arrays.practice;

import java.util.Arrays;
import java.util.Scanner;

import com.jsp.arrays.Array;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n=sc.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the "+n+" values");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
			System.out.println(i+"-------------->"+ar[i]);
		}
		
	}
}
		//		sumofintegers(ar);
	//	int[] i = evenorodd(ar);
//						averageofnum(ar);
//	}
//
//
//			 static void averageofnum(int[] x) {
//					int avg=0;
//			 int sum=0;
//				for(int i=1;i<x.length;i++)
//				{
//					
//					sum=sum+x[i];
//		            avg=sum/i;
//		
//				}
//			     System.out.println(avg);
//	
//			 }
//} 
	//		 }
	//	

	//

//	static int[] evenorodd(int[] x) 
//	{
//		int ec=0;
//		int oc=0;
//		for (int i = 0; i < x.length; i++) {
//			if(x[i]%2==0) {
//				ec++;
//				System.out.println("even");
//			}
//			else 
//			{
//				System.out.println("odd");
//				oc++;
//			}
//		}
//		int[] rs= {oc,ec};
//		return rs;
//	}
//}

//	static void sumofintegers(int []x) {
//		int sum=0;
//		for(int i=0;i<x.length;i++)
//		{
//			sum=sum+x[i];
//
//		}
//		System.out.println(sum+" is the sum");
//
//	}
//}
