package com.jsp.programming.patterns;

import java.util.Scanner;

public class Star1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n=sc.nextInt();
		star(n);

	}
	// to print
	//         1
	//        121
	//       12321
	//      1234321
	//     123454321

	//	 static void star(int n) {
	//	
	//	for(int i=1;i<=n;i++)
	//	{int x=1;
	//		for(int j=n;j>i;j--)
	//		{
	//			System.out.print(" ");		
	//		}
	//		for(int j=1;j<=2*i-1;j++)
	//	
	//		{
	//			System.out.print(x);
	//			if(j<i)
	//				x++;
	//			else
	//				x--;
	//		}
	//		System.out.println();
	//	}
	//	}
	//	}   

	//to print
	//      5 
	//     454
	//    34543
	//   2345432
	//  123454321


	//	static void star(int n)
	//	{
	//		int x=n;
	//	for(int i=1;i<=n;i++)
	//	{
	//		for(int j=1;j<=n-i;j++)
	//		{
	//			System.out.print(" ");
	//		}
	//		for(int j=1;j<=2*i-1;j++)
	//		{
	//			System.out.print(x);
	//			if(j<i)
	//				x++;
	//			else
	//				x--;
	//	}
	//	System.out.println();	
	//	}
	//	}
	//	}


	//to print

	//543212345
	// 4321231
	//  32123
	//   212
	//    1
	//static void star(int n )
	//{
	//for(int i=n;i>0;i--)
	//{int x=i;
	//
	//for(int j=i;j<=n;j++)
	//{
	//	System.out.print(" ");
	//}
	//for(int j=1;j<=2*i-1;j++)
	//{
	//	System.out.print(x);
	//	if(j<i)
	//		x--;
	//	else
	//		x++;
	//}
	//System.out.println();
	//}
	//}
	//}

	//to print
	//   123454321
	//    1234321
	//     12321
	//      212
	//       1
	//static void star(int n )
	//{
	//	for(int i=n;i>=1;i--)
	//	{int x=1;
	//		for(int j=i;j<=n;j++)
	//	{
	//System.out.print(" ");		
	//	}
	//		for(int j=1;j<=2*i-1;j++)
	//		{
	//			System.out.print(x);
	//			if(j<i)
	//				x++;
	//			else
	//				x--;
	//		}
	//		System.out.println();
	//	}
	//}
	//}

	// to print
	//         1
	//        212
	//       32121
	//      4321234
	//     543212345
	//static void star(int n)
	//{
	//	for(int i=1;i<=n;i++)
	//	{ int x=i;
	//		for(int j=i;j<=n;j++)
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
	//		
	//		System.out.println();
	//	}
	//}
	//
	//}

	//to print
	//     123454321
	//      1234321
	//       12321
	//        121
	//         1
	//static void star(int n )
	//{
	//for(int i=n;i>=1;i--)
	//{
	//	for(int j=i;j<=n;j++)
	//	{
	//		System.out.print(" ");
	//	}
	//	int x=1;
	//
	//	for(int j=1;j<=2*i-1;j++)
	//	{
	//		System.out.print(x);
	//		if(j<i)
	//			x++;
	//		else
	//			x--;
	//	}
	//	System.out.println();
	//}
	//}
	//}
	//to print
	//	 543212345
	//	  4321234
	//	   32123
	//	    212
	//	     1
	//	static void star(int n)
	//	{
	//		for(int i=n;i>0;i--)
	//		{ 			int x=i;
	//
	//		for(int j=i;j<=n;j++)
	//		{
	//			System.out.print(" ");
	//		}
	//		for(int j=1;j<=2*i-1;j++)
	//		{
	//		System.out.print(x);
	//		if(j<i)
	//			x--;
	//		else
	//			x++;
	//		}
	//		System.out.println();
	//		}
	//
	//	}
	//}

	//to print
	//	1 2 3 4 5 4 3 2 1 
	//	  2 3 4 5 4 3 2 
	//	    3 4 5 4 3 
	//	      4 5 4 
	//	        5 

	//		static void star(int n)
	//		{
	//			int sp=0,st=n*2-1;
	//			for(int i=1;i<=n;i++)
	//			{ 
	//				for(int j=1;j<=sp;j++)
	//				{
	//				System.out.print("  ");
	//				}
	//				int x=i;
	//					for(int j=1;j<=st;j++)
	//					{
	//						System.out.print(x+" ");
	//					if(j<st/2+1)
	//						x++;
	//					else
	//						x--;
	//						
	//					}
	//					st=st-2;
	//					sp++;
	//					System.out.println();
	//				}
	//			}
	//}

	//	to print
	//    5
	//   545
	//  54345
	// 5432345
	//543212345	
	//	static void star(int n)
	//	{
	//		for(int i=1;i<=n;i++)
	//		{int x =n;
	//			for(int j=i;j<n;j++)
	//			{
	//				System.out.print(" ");
	//			}
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
	//		}
	//	}



	//	to print
	//	     E
	//	    FEF
	//	   GFEFG
	//	  HGFEFGH
	//	 IHGFEFGHI

	//	static void star(int n)
	//	{
	//		for(int i=1;i<=n;i++)
	//		{int x=n;
	//			for(int j=n;j>=i;j--)
	//			{
	//				System.out.print(" ");
	//				
	//			}
	//			for(int j=1;j<=2*i-1;j++)
	//			{
	//				System.out.print((char)(x+64));
	//				if(j<i)
	//					x--;
	//				else
	//					x++;
	//			}
	//			System.out.println();
	//			}
	//		}
	//	}

	//to print
	//	     A
	//	    BAB
	//	   CBABC
	//	  DCBABCD
	//	 EDCBABCDE
	//	static void star(int n)
	//	{
	//		for(int i=1;i<=n;i++)
	//		{int x=i;
	//		for(int j=i;j<=n;j++)
	//		{
	//			System.out.print(" ");
	//		}
	//		for(int j=1;j<=2*i-1;j++)
	//		{
	//			System.out.print((char)(x+64));
	//			if(j<i)
	//				x--;
	//			else
	//				x++;
	//
	//		}
	//		System.out.println();
	//		}	
	//	}		
	//}
	//

	//	static void star(int n)
	//	{
	//
	//		int sp=n/2;
	//		int st=1;
	//		for(int i=1;i<=n;i++)
	//		{
	//			for(int j=i;j<=sp;j++)
	//			{
	//			System.out.print("  ");
	//			}
	//				for(int j=i;j<=st;j++)
	//				{
	//					System.out.print("* ");
	//				}
	//				if(i<=n/2)
	//				{
	//					  sp--;
	//					  st=st+2;
	//				}
	//				else
	//				{
	//					sp++;
	//				   st=st-2;
	//				}
	//				System.out.println();
	//			}
	//		
	//		}
	//		
	//	}
	//	
	//
	//	to print
	//	123454321
	//	 2345432
	//	  34543
	//	   454
	//	    5
	//	static void star(int n)
	//	{
	//		for(int i=1;i<=n;i++)
	//		{   		
	//			int x=i;
	//			for(int j=1;j<i;j++)
	//			{	
	//				System.out.print(" ");
	//			}
	//			for(int j=i;j<=n+n-i;j++)
	//			{ 
	//				System.out.print(x);
	//				if(j<n)
	//					x++;
	//				else
	//					x--;
	//				
	//			}
	//			System.out.println();
	//		}
	//	}
	//}
	//	      1 
	//	    0 0 0 
	//	  1 1 1 1 1 
	//	0 0 0 0 0 0 0 
	//	  1 1 1 1 1 
	//	    0 0 0 
	//	      1 
	//

	//	static void star(int n)
	//	{ int sp=n/2;
	//	int  st=1;
	//
	//	for(int i=1;i<=n;i++)
	//	{int x=i;
	//		for(int j=1;j<=sp;j++)
	//		{
	//			System.out.print("  ");	
	//		}
	//		for(int j=1;j<=st;j++)
	//		{
	//			System.out.print(x%2+" ");
	//		}
	//			if(i<=n/2)
	//			{
	//				sp--;
	//				st=st+2;
	//			}
	//			else
	//			{
	//				sp++;
	//				st=st-2;
	//			}
	//			System.out.println();
	//	}
	//	}
	//	}


	//         1 
	//       0 1 0 
	//     1 0 1 0 1 
	//   0 1 0 1 0 1 0 
	//     1 0 1 0 1 
	//       0 1 0 
	//         1 


	//	static void star(int n)
	//	{ int sp=n/2;
	//	  int st=1;
	//
	//	for(int  i=1;i<=n;i++)
	//	{   int x=i;
	//		for(int j=1;j<=sp;j++)
	//		{
	//			System.out.print("  ");
	//		}
	//		for(int j=1;j<=st;j++)
	//		{ 
	//			System.out.print(x%2+" ");
	//			if(j<=i)
	//			    x++;
	//			    else
	//			    	x--;
	//	    
	//		}
	//		
	//		
	//			if(i<n/2)
	//			{
	//				sp--;
	//			    st=st+2;
	//			}
	//			else
	//			{
	//				sp++;
	//				st=st-2;
	//			}
	//		
	//	System.out.println();
	//	}
	//	}
	//	}
	//	1 1 1 1 1 1 1 
	//	  0 0 0 0 0 
	//	    1 1 1 
	//	      0 
	//	    1 1 1 
	//	  0 0 0 0 0 
	//	1 1 1 1 1 1 1 

	//
	//	static void star(int n)
	//	{  int sp=0;
	//	int st=n;
	//
	//	for(int i=1;i<=n;i++)
	//	{ int x=i;
	//	for(int j=1;j<=sp;j++)
	//	{
	//		System.out.print("  ");
	//	}
	//	for(int j=1;j<=st;j++)
	//	{
	//		System.out.print(x%2+" ");
	//	}
	//	if(i<=n/2)
	//	{
	//		sp++;
	//		st=st-2;
	//	}
	//	else
	//	{
	//		sp--;
	//		st=st+2;
	//	}
	//
	//	System.out.println();
	//	}
	//	}
	//}


	//	1 0 1 0 1 0 1 
	//	  1 0 1 0 1 
	//	    1 0 1 
	//	      1 
	//	    1 0 1 
	//	  1 0 1 0 1 
	//	1 0 1 0 1 0 1 

	//	static void star(int  n )
	//	{  int sp=0;
	//	int st=n;
	//		for(int i=1;i<=n;i++)
	//		{
	//			for(int j=1;j<=sp;j++)
	//			{
	//				System.out.print("  ");
	//			}
	//			for(int j=1;j<=st;j++)
	//			{
	//				System.out.print(j%2+" ");
	//			}
	//			if(i<=n/2)
	//			{
	//				sp++;
	//				st=st-2;
	//			}
	//			else
	//			{
	//				sp--;
	//				st=st+2;
	//			}
	//System.out.println();
	//		}
	//	}
	//}

	//	static void star(int n)
	//	{ int sp=n/2;
	//	int st=1;
	//
	//	for(int i=1;i<=n;i++)
	//	{
	//		for(int j=1;j<=sp;j++)
	//		{
	//			System.out.print(" ");
	//		}
	//		for(int j=1;j<=st;j++)
	//		{
	//			System.out.print(i+" ");
	//		}
	//		if(i<n/2)
	//
	//		{
	//			sp--;
	//			st=st+2;
	//		}
	//		else
	//		{
	//			sp++;
	//			st=st-2;
	//		}
	//		System.out.println();
	//	}
	//
	//	}
	//}


	static void star(int n)
	{
		for (int i = n; i >0; i--) 
		{
			int x=i;
			for(int j=i;j>0;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<(n-i)*2-1;j++)
			{
				System.out.print(x);
				if(i<n)
					x++;
				else
					x--;
			}
			System.out.println();
		}

	}
}
