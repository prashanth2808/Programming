package com.jsp.test;

import java.util.Iterator;
import java.util.Scanner;

public class Stars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		star(n);

	}

	//	private static void star(int n)
	//	{
	//		for (int i = 1; i <=n; i++)
	//		{
	//			for (int j = n-i; j>0; j--)
	//			{
	//				System.out.print(" ");
	//
	//			}
	//			for (int j = 1; j <=i; j++) 
	//			{	
	//				System.out.print(j);
	//			}
	//			System.out.println();
	//		}
	//	}
	//	private static void star(int n)
	//	{
	//		for (int i = n; i >0; i--)
	//		{
	//			for (int j = i; j >1; j--)
	//			{
	//				System.out.print(" ");			
	//			}	
	//			for (int j = n-i+1; j >0 ; j--)
	//			{
	//				System.out.print(j+"");
	//			}
	//			System.out.println();
	//		}
	//	}
	//}
	//	private static void star(int n)
	//	{
	//		for (int i = 0; i < n; i++) {
	//			for (int j = n; j >i ; j--) 
	//			{
	//				System.out.print(j);
	//			}
	//			System.out.println();
	//		}
	//
	//	}
	//}
	//	private static void star(int n)
	//	{
	//		for(int i=n;i>0;i--)
	//		{
	//			for(int j=i;j>1;j--)
	//			{
	//				System.out.print(" ");
	//			}
	//			for(int j=n;j>=i;j--)
	//			{
	//				System.out.print(j);
	//			}
	//			System.out.println();
	//			}
	//		}
	//	}

	//	private static void star(int n)
	//	{
	//		for(int i=1;i<=n;i++)
	//		{
	//			for(int j=n-i;j>0;j--)
	//			{
	//				System.out.print(" ");
	//			}
	//			for(int j=i;j>0;j--)
	//			{
	//				System.out.print(j);	
	//			}
	//			System.out.println();
	//		}
	//	}
	//}

	//	private static void star(int n)
	//	{
	//		for(int i=n;i>0;i--)
	//		{
	//			for(int j=n;j>=i;j--)
	//			{
	//				System.out.print(j);
	//			}
	//			System.out.println();
	//		}
	//	}
	//	}

	//	private static void star(int n)
	//	{
	//		for(int i=1;i<=n;i++)
	//		{
	//			for(int j=1;j<i;j++)
	//			{
	//				System.out.print(" ");
	//			}
	//			for(int j=n-i+1;j>=1;j--)
	//			{
	//				System.out.print(j);
	//			}
	//			System.out.println();
	//		}
	//		}
	//	}

	//	private static void star(int n)
	//	{
	//		for(int i=1;i<n;i++)
	//		{
	//			for(int j=1;j<i;j++)
	//			{
	//				System.out.print(" ");
	//			}
	//			for(int j=n-i;j>0;j--)
	//			{
	//				System.out.print((char)(j+64));
	//			}
	//			System.out.println();
	//		}
	//
	//	}
	//}
	//   123454321
	//    1234321
	//     12321
	//      121
	//       1


//	static void star(int n)
//	{
//
//		for(int i=n;i>0;i--)
//		{int x=1;
//		for(int j=1;j<=n-i;j++)
//		{
//			System.out.print(" ");
//		}
//		for(int j=1;j<=2*i-1;j++)
//		{
//			System.out.print(x);
//
//			if(j<i)
//				x++;
//			else	
//				x--;
//		}
//		System.out.println();
//		}
//	}
//}
	
	//	 543212345
	//	  4321234
	//	   32123
	//	    212
	//	     1
//	static void star(int n )
//	{
//		for(int i=n;i>0;i--)
//		{int x=i;
//			for(int j=1;j<=n-i;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int j=1;j<=2*i-1;j++)
//			{
//				System.out.print(x);
//				if(j<i)
//				x--;
//				else
//					x++;
//				
//			}
//			System.out.println();
//			}
//		}
//	}
	
	//to print
		//	1 2 3 4 5 4 3 2 1 
		//	  2 3 4 5 4 3 2 
		//	    3 4 5 4 3 
		//	      4 5 4 
		//	        5 

	
	static void star(int n)
	{
		for(int i=n;i>0;i--)
		{
			int x=n-i;
		
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(x+" ");
				if(j<i)
					x++;
				else
					x--;
				
			}
			
			System.out.println();	
			}
			
		}
	}
