package com.jsp.programming.patterns;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n =sc.nextInt();
		star(n);
	}

	// static void star(int n) {
	//for(int i=1;i<=n;i++)
	//{int x=i;
	//	for(int j=n;j>=i;j--)
	//	{
	//	System.out.print(" ");
	//	}
	//		for(int j=1;j<=2*i-1;j++)
	//		{
	//			System.out.print(x);
	//			if(j<i)
	//				x--;
	//			else
	//				x++;
	//		}
	//		System.out.println();
	//}
	//}
	//}
	//

	//123454321
	// 1234321
	// 12321
	//  121
	//   1
	//static void star(int n)
	//{
	//	for(int i=n;i>=1;i--)
	//	{
	//		int x=1;
	//		for(int j=i;j<=n;j++)
	//		{
	//			System.out.print(" ");
	//		}
	//	for(int j=1;j<=2*i-1;j++)
	//	{
	//		System.out.print(x);
	//		if(j<i)
	//			x++;
	//		else
	//			x--;
	//	}
	//	System.out.println();
	//	}
	//}

//	543212345
//	 4321234
//	  32123
//	   212
//	    1

//	static void star(int n)
//	{
//		for(int i=n;i>=1;i--)
//		{ 
//			int x=i;
//		for(int j=1;j<=n-i;j++)
//		{
//			System.out.print(" ");
//		}
//		for(int j=1;j<=2*i-1;j++)
//		{
//			System.out.print(x);
//			if(j<i)
//				x--;
//			else
//				x++;
//		}	
//		System.out.println();
//		}
//	}
//}
	
	
//	   5
//    454
//   34543
//  2345432
// 123454321

//	static void star(int n)
//	{
//		for(int i=1;i<=n;i++)
//		
//			{int x=n-i+1;
//			for(int j=n;j>=i;j--)
//			{
//				System.out.print(" ");
//			}
//			for(int j=1;j<=2*i-1;j++)
//			{
//				System.out.print(x);
//				if(j<i)
//					x++;
//				else
//					x--;
//					
//							
//			}
//System.out.println();
//		}
//	}
//}
	
	static void star(int n)
	{
		for(int i=1;i<=n;i++)
		{ int x=i;
			for(int j=1;j<i;j++)
			{
			System.out.print(" ");
			}
				for(int j=i;j<=n+n-i;j++)
				{
					System.out.print(x);
					if(j<n)
						x++;
					else
						x--;
				}
		System.out.println();	
		}
		}
	}