package com.jsp.programming.patterns;

import java.util.Iterator;
import java.util.Scanner;

public class Stars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the value of n :");
		int n =sc.nextInt();
		star(n);

	}
	//to print 5*5 stars
	//	* * * * * 
	//	* * * * * 
	//	* * * * * 
	//	* * * * * 
	//	* * * * * 
	//	static void star(int n)
	//	{
	//		for (int i = 1; i<=n; i++) //represent rows
	//		{
	//			for (int j =1; j<=n; j++) // represents column
	//			{
	//				System.out.print("* "); 
	//			}
	//			System.out.println();
	//		}
	//	}
	//}

	//to print 5*1 stars
	//	* * * * * 
	//	* * * * 
	//	* * * 
	//	* * 
	//	* 

	//	static void star(int n)
	//	{
	//		for (int i = 1; i<=n; i++) 
	//		{
	//			for (int j =i; j<=n; j++)
	//			{
	//				System.out.print("* "); 
	//			}
	//			System.out.println();
	//		}
	//	}
	//}
	//to print 1*5 stars
	//	static void star(int n)
	//	{
	//		for (int i = 1; i<=n; i++) 
	//		{
	//			for (int j =1; j<=i; j++)
	//			{
	//				System.out.print("* "); 
	//			}
	//			System.out.println();
	//		}
	//	}
	//}

	//to print 1*5  r*c
	//	1 
	//	1 2 
	//	1 2 3 
	//	1 2 3 4 
	//	1 2 3 4 5 
	//
	//	static void star(int n)
	//	{
	//		for (int i = 1; i<=n; i++) 
	//		{
	//			for (int j =1; j<=i; j++)
	//			{
	//				System.out.print(j+" "); 
	//			}
	//			System.out.println();
	//		}
	//	}
	//}

	//to print 5*1
	//	1 2 3 4 5 
	//	1 2 3 4 
	//	1 2 3 
	//	1 2 
	//	1 
	//	static void star(int n)
	//	{
	//		for (int i=n; i>0; i--) 
	//		{
	//			for (int j =1; j<=i; j++)
	//			{
	//				System.out.print(j+" "); 
	//			}
	//			System.out.println();
	//		}
	//	}
	//}

	//to print 1 to 25, give n=5
	//	 1  2  3  4  5 
	//	 6  7  8  9 10 
	//	11 12 13 14 15 
	//	16 17 18 19 20 
	//	21 22 23 24 25 
	//	static void star(int n)
	//	{	int k=1;
	//
	//		for (int i=1; i<=n; i++) 
	//		{
	//			for (int j=1; j<=n; j++)
	//			{
	//				System.out.printf("%2d ",k++); 
	//			}
	//			System.out.println();
	//		}
	//	}
	//}

	//to print 1 1 1
	//         2 2 2 
	//         3 3 3 
	//	static void star(int n)
	//	{
	//		for (int i=1; i<=n; i++) 
	//		{
	//			for (int j =1; j<=n; j++)
	//			{
	//				System.out.print(i+" "); 
	//			}
	//			System.out.println();
	//		}
	//	}
	//}

	//to print  1 0 1 0 
	//          1 0 1 0
	//          1 0 1 0
	//	static void star(int n)
	//	{
	//		for (int i=1; i<=n; i++) 
	//		{
	//			for (int j =1; j<=n; j++)
	//			{
	//				System.out.print(j%2+" ");
	//			}				
	//			System.out.println();
	//		}
	//	}
	//}


	//to print 0 1 0 1
	//         0 1 0 1
	//         0 1 0 1
	//	static void star(int n)
	//	{
	//		for (int i=1; i<=n; i++) 
	//		{
	//			for (int j =0; j<n; j++)
	//			{
	//				System.out.print(j%2+" ");
	//			}				
	//			System.out.println();
	//		}
	//	}
	//}

	//to print 5 4 3 2 1
	//         5 4 3 2 1
	//         5 4 3 2 1
	//	static void star(int n)
	//	{
	//		for (int i=n; i>=1; i--) 
	//		{
	//			for (int j=n; j>=1; j--)
	//			{
	//				System.out.print(j+" ");
	//			}				
	//			System.out.println();
	//		}
	//	}
	//}

	//to print 1 2 3 4 5
	//         2 3 4 5 
	//         3 4 5
	//         4 5
	//         5
	//		static void star(int n)
	//		{
	//			for (int i=1; i<=n; i++) 
	//			{
	//				for (int j=i; j<=n; j++)
	//				{
	//					System.out.print(j+" ");
	//				}				
	//				System.out.println();
	//			}
	//		}
	//	}



	//to print 5 4 3 2 1
	//         4 3 2 1 
	//         3 2 1
	//         2 1
	//         1
	//		static void star(int n)
	//		{
	//			for (int i=n; i>=1; i--) 
	//			{
	//				for (int j=i; j>=1; j--)
	//				{
	//					System.out.print(j+" ");
	//				}				
	//				System.out.println();
	//			}
	//		}
	//	}


	//	to print     5 
	//		         5 4  
	//		         5 4 3 
	//		         5 4 3 2 
	//		         5 4 3 3 1
	//	static void star(int n)
	//	{
	//		for (int i=n; i>0; i--) 
	//		{
	//			for (int j=n; j>=i; j--)
	//			{
	//				System.out.print(j+" ");
	//			}				
	//			System.out.println();
	//		}
	//	}
	//}


	//	to print     1 
	//		         2 1  
	//		         3 2 1
	//		         4 3 2 1
	//		         5 4 3 2 1 
	//	static void star(int n)
	//	{
	//		for (int i=1; i<=n; i++) 
	//		{
	//			for (int j=i; j>=1; j--)
	//			{
	//				System.out.print(j+" ");
	//			}				
	//			System.out.println();
	//		}
	//	}
	//}

	//	to print     1 2 3 4 5
	//		         1 2 3 4  
	//		         1 2 3
	//		         1 2
	//		         1 
	//	static void star(int n)
	//	{
	//		for (int i=5; i>=0; i--) 
	//		{
	//			for (int j=1; j<=i; j++)
	//			{
	//				System.out.print(j+" ");
	//			}				
	//			System.out.println();
	//		}
	//	}
	//}


	//	to print     1 
	//		         1 0   
	//		         1 0 1 
	//		         1 0 1 0 
	//		         1 0 1 0 1
	//	static void star(int n)
	//	{
	//		for (int i=1; i<=n; i++) 
	//		{
	//			for (int j=1; j<=i; j++)
	//			{
	//				System.out.print(j%2+" ");
	//			}				
	//			System.out.println();
	//		}
	//	}
	//}
	//		to print     1 
	//			         0 0   
	//			         1 1 1  
	//			         0 0 0 0 
	//			         1 1 1 1 1
	//	static void star(int n)
	//	{
	//		for (int i=1; i<=n; i++) 
	//		{
	//			for (int j=1; j<=i; j++)
	//			{
	//				System.out.print(i%2+" ");
	//			}				
	//			System.out.println();
	//		}
	//	}
	//}
	//	to print         5 5 5 5 5
	//			         4 4 4 4 4 
	//			         3 3 3 3 3 
	//			         2 2 2 2 2
	//			         1 1 1 1 1
	//	static void star(int n)
	//	{
	//		for (int i=n; i>0; i--) 
	//
	//		{
	//			for (int j=1; j<=n; j++)
	//			{
	//				System.out.print(i+" ");
	//			}				
	//			System.out.println();
	//		}
	//	}
	//}
	//	to print         A 
	//			         A B  
	//			         A B C   
	//			         A B C D 
	//			         A B C D E
	//		static void star(int n)
	//		{
	//			for (int i=1; i<=n; i++) 
	//	
	//			{
	//				for (int j=1; j<=i; j++)
	//				{
	//					System.out.print((char)(j+64)+" ");
	//				}				
	//				System.out.println();
	//			}
	//		}
	//	}
	//	to print         A 
	//			         B B  
	//			         C C C   
	//			         D D D D 
	//			         E E E E E
	//			static void star(int n)
	//			{
	//				for (int i=1; i<=n; i++) 
	//		
	//				{
	//					for (int j=1; j<=i; j++)
	//					{
	//						System.out.print((char)(i+64)+" ");
	//					}				
	//					System.out.println();
	//				}
	//			}
	//		}
	//	to print         5 
	//			         4 4  
	//			         3 3 3   
	//			         2 2 2 2 
	//			         1 1 1 1 1
	//	static void star(int n)
	//	{
	//		for (int i=5; i>=1; i--) 
	//		{
	//			for (int j=i; j<=n; j++)
	//			{
	//				System.out.print(i+" ");
	//			}				
	//			System.out.println();
	//		}
	//	}
	//}

	//		to print         1 0 1 0 1
	//				         0 1 0 1 0  
	//				         1 0 1 0 1
	//				         0 1 0 1 0
	//				         1 0 1 0 1
	//	static void star(int n)
	//	{
	//		for (int i=1; i<=n; i++) 
	//		{
	//			for (int j=1; j<=n; j++)
	//			{
	//				System.out.print((i*j)%2+" ");
	//			}
	//			System.out.println();
	//		}				
	//	}
	//}
	//	to print             1 0 1 0 1
	//				         0 1 0 1 0  
	//				         1 0 1 0 1
	//				         0 1 0 1 0
	//				         1 0 1 0 1
	//	static void star(int n)
	//	{
	//		for (int i=1; i<=n; i++) 
	//		{
	//			for (int j=0; j<=n; j++)
	//			{
	//				System.out.print(i+j+" ");
	//			}
	//			System.out.println();
	//		}				
	//	}
	//}

	//to print     
	//     *
	//    **
	//   ***
	//  ****
	// *****
	//	static void star(int n)
	//	{
	//		for (int i = 1; i <=n; i++)
	//		{
	//			for (int j = 1; j <=n-i ; j++) 
	//			{
	//				System.out.print("  ");
	//			}
	//			for (int j = 1; j <=i; j++) {
	//				System.out.print("* ");
	//			}
	//			System.out.println();
	//
	//		}
	//
	//	}
	//}


	//to print 
	//* * * * *
	//  * * * * 
	//    * * *
	//      * *
	//        *

	//	static void star(int n )
	//	{
	//
	//		for (int i = n; i>=1; i--)
	//		{
	//			for (int j=1; j<=n-i;j++)
	//			{
	//				System.out.print("  ");
	//			}
	//			for  (int j=1;j<=i;j++)
	//			{
	//				System.out.print("* ");
	//			}
	//			System.out.println();
	//		}
	//
	//	}
	//
	//}
	//to print
	//      * 
	//     ***
	//    ******
	//   ********

	//	static void star(int n )
	//	{
	//
	//		for (int i = 1; i<=n; i++)
	//		{
	//			for (int j=1; j<=n-i;j++)
	//			{
	//				System.out.print("  ");
	//			}
	//			for  (int j=1;j<=(2*i)-1;j++)
	//			{
	//				System.out.print("* ");
	//			}
	//			System.out.println();
	//		}
	//
	//	}
	//
	//}

	//to print
	//        1       
	//	     21         
	//  	321           
	//	   4321            
	//	  54321    
	//	static void star(int n )
	//	{
	//		for (int i=1; i<=n; i++) 
	//		{
	//			for (int j=1; j<=n-i; j++) {
	//				System.out.print(" ");
	//			}
	//			for (int j=i; j>0; j--) {
	//				System.out.print(j+"");
	//			}
	//			System.out.println();
	//		}
	//	}
	//}
	//to print
	//    54321
	//     4321
	//      321
	//       21
	//        1
	//	static void star(int n  )
	//	{
	//		for (int i=n; i>0; i--)
	//		{
	//			for(int j=i;j<=n;j++)
	//			{
	//				System.out.print("  ");	
	//			}
	//			for(int j=i;j>0;j--)
	//			{
	//				System.out.print(j+" ");
	//			}
	//			System.out.println();
	//		}
	//	}
	//}

	//to print
	//	   1
	//	  10
	//	 101
	//	1010
	// 10101
	//	static void star(int n  )
	//	{
	//		for(int i=n;i>0;i--)
	//		{
	//			for (int j=i;j>0;j--)
	//			{
	//				System.out.print(" ");
	//			}
	//			for(int j=1;j<=n-i+1;j++)
	//			{
	//				System.out.print(j%2);
	//			}
	//			System.out.println( );
	//		}
	//	}
	//}

	//to print
	//	           1
	//	          000
	//	         11111
	//	        0000000
	//	       111111111
	//	static void star(int n  )
	//	{
	//		for (int i=1;i<=n;i++)
	//		{
	//			for(int j=i;j<=n;j++)
	//			{
	//				System.out.print(" ");
	//			}
	//			for(int j=1;j<2*i;j++)
	//			{
	//				System.out.print(i%2+"");
	//			}
	//			System.out.println("");
	//		}
	//	}
	//}

	//to print
	//	           1
	//	          101
	//	         10101
	//	        1010101
	//		   101010101
	//	static void star(int n)
	//	{ 
	//		for(int i=1;i<=n;i++)
	//		{
	//			for(int j=n;j>=i;j--)
	//			{
	//				System.out.print(" ");
	//			}
	//			for(int j=1;j<(2*i);j++)
	//			{
	//				System.out.print(j%2);
	//			}
	//			System.out.println();
	//		}
	//	}
	//}


	//	static void star(int n )
	//	{
	//		for(int i=1;i<=n;i++)
	//		{
	//			for(int j=1;j<=i;j++)
	//			{
	//				System.out.print(j);
	//			}
	//			System.out.println();
	//		}
	//	}}
	// to print 
	//	      1         
	//       1*2              
	//      1*2*3         
	//     1*2*3*4      
	//    1*2*3*4*5 
	//	static void star(int n )
	//	{
	//		for (int i=1;i<=n;i++)
	//		{
	//			for(int j=i;j<=n;j++)
	//			{
	//				System.out.print(" ");
	//			}
	//			for(int j=1;j<=i;j++)
	//			{
	//				System.out.print(j);
	//				if(j<i)
	//					System.out.print("*");
	//			}
	//			System.out.println();
	//		}
	//	}
	//}
	//to print
	//	 1
	//	 2 6
	//	 3 7 10
	//	 4 8 11 13
	//	 5 9 12 14 15
	//static void star(int n)
	//{
	//int k;
	//for(int i=1;i<=n;i++)
	//{
	//	k=i;
	//	for(int j=1;j<=i;j++)
	//	{
	//		System.out.printf("%2d ",k);
	//		k=k+n-j;
	//	}
	//	System.out.println();
	//}
	//}
	//}

	// to print  
	// 	 111111111
	//	  0000000
	//	   11111
	//	    000
	//	     1
	//	static void star(int n )
	//	{
	//	for(int i=n;i>=0;i--)
	//	{
	//		for(int j=i;j<=n;j++)
	//		{
	//			System.out.print(" ");
	//
	//		}
	//		for(int j=1;j<(2*i);j++)
	//		{
	//			System.out.print(i%2);
	//		}
	//		System.out.println();
	//	}
	//	}
	//}

	// to print
	//	1*2*3*4*5
	//	 1*2*3*4
	//	  1*2*3
	//	   1*2
	//	    1
	//	static void star(int n )
	//	{
	//		for(int i=n;i>=0;i--)
	//		{
	//			for(int j=i;j<=n;j++)
	//			{
	//				System.out.print(" ");
	//
	//			}
	//			for(int j=1;j<=i;j++)
	//			{
	//				System.out.print(j);
	//				if(j<i)
	//					System.out.print("*");
	//			}
	//			System.out.println();
	//		}
	//	}
	//}
	// to print
	//       1
	//      121
	//     12321
	//    1234321
	//   123454321
	//			static void star(int n)
	//			{
	//				for(int i=1;i<=n;i++)
	//				{
	//					for(int j=1;j<=n-i;j++)
	//					{
	//						System.out.print(" ");
	//					}
	//					int x=1;
	//		
	//					for(int j=1;j<=2*i-1;j++)
	//					{
	//		
	//						System.out.print((char)(x+64));
	//						if(j<i)
	//							x++;
	//						else
	//							x--;
	//					}
	//					System.out.println();
	//				}
	//			}
	//		}

	// to print
	//	    1
	//	   212
	//	  32123
	//	 4321234
	//	543212345
	//	static void star(int n)
	//	{
	//		for(int i=1;i<=n;i++)
	//		{
	//			for(int j=1;j<=n-i;j++)
	//			{
	//				System.out.print(" ");
	//			}
	//			int x=i;
	//
	//			for(int j=1;j<=2*i-1;j++)
	//			{
	//
	//				System.out.print(x);
	//				if(j<i)
	//					x--;
	//				else
	//					x++;
	//			}
	//			System.out.println();
	//		}
	//	}
	//}

	// to print
	//    5
	//   454
	//  34543
	// 2345432
	//123454321
	//		static void star(int n)
	//		{
	//			for(int i=1;i<=n;i++)
	//			{
	//				for(int j=1;j<=n-i;j++)
	//				{
	//					System.out.print(" ");
	//				}
	//				int x=n-i+1;
	//	
	//				for(int j=1;j<=2*i-1;j++)
	//				{
	//	
	//					System.out.print(x);
	//					if(j<i)
	//						x++;
	//					else
	//						x--;
	//				}
	//				System.out.println();
	//			}
	//		}
	//}
	// to print

	//	 543212345
	//	  4321234
	//	   32123
	//	    212
	//	     1
	//		static void star(int n )
	//		{
	//			for(int i=n;i>0;i--)
	//			{
	//				int x=i;
	//				
	//				for(int j=i;j<=n;j++)
	//				{
	//					System.out.print(" ");
	//				}
	//				for(int j=1;j<=2*i-1;j++)
	//				{			
	//	
	//				System.out.print(x);
	//	
	//				if(j<i)	
	//					x--;
	//				else
	//					x++;
	//	
	//				}
	//	
	//				System.out.println();		
	//			}
	//		}
	//	}
	//to print
	//     123454321
	//	    1234321
	//       12321
	//        121
	//         1

	//static void star(int n )
	//	{
	//		for(int i=1;i<=n;i++)
	//		{
	//			for(int j=i;j>0;j--)
	//			{
	//				System.out.print(" ");
	//			}
	//			for(int j=1;j<=(n-i+1);j++)
	//			{
	//				System.out.print(j);
	//			}
	//			for(int k=n-i;k>=1;k--)
	//			{
	//				System.out.print(k);
	//			}
	//
	//			System.out.println();
	//		}
	//	}
	//}

	// to print
	//       A
	//      ABA
	//     ABCBA
	//    ABCDCBA
	//   ABCDEDCBA
	//	static void star(int n)
	//	{
	//		for(int i=n;i>=0;i--)
	//		{
	//			for(int j=i;j>=0;j--)
	//			{
	//				System.out.print(" ");
	//			}
	//			int x=1;
	//
	//			for(int j=1;j<(n-i)*2;j++)
	//			{
	//				System.out.print(x);
	//				if(j<i)
	//					x++;
	//				else
	//					x--;
	//			}
	//			System.out.println();
	//		}
	//	}
	//}


	//	static void star(int n) 
	//	{
	//		for(int i=1;i<=n;i++)
	//
	//		{			int x=i;
	//
	//			{
	//				System.out.print(x);
	//				if(x<n)
	//					x++;
	//				else
	//					x --;
	//			}
	//			System.out.print("");
	//		}
	//	}
	//}
	// to print
	//	 543212345
	//	  4321234
	//	   32123
	//	    212
	//	     1
	//	static void star(int n) 
	//	{
	//		for (int i = n;i>0;i--)
	//		{
	//			for (int j = 1; j <=n-i; j++)
	//			{
	//				System.out.print("  ");
	//
	//			}
	//			int x=i;
	//			for (int j = 1; j <i*2; j++)
	//			{
	//				System.out.print(x+" ");
	//				if(j<i)
	//					x--;
	//				else
	//					x++;
	//			}
	//			System.out.println();
	//
	//		}
	//	}
	//}

	//to print
	//E D C B A B C D E 
	//  D C B A B C D 
	//    C B A B C 
	//      B A B 
	//        A 
	//static void star(int n) 
	//{
	//	for (int i = n;i>0;i--)
	//	{
	//		for (int j = 1; j <=n-i; j++)
	//		{
	//			System.out.print("  ");
	//
	//		}
	//		int x=i;
	//		for (int j = 1; j <i*2; j++)
	//		{
	//			System.out.print(x+" ");
	//			if(j<i)
	//				x--;
	//			else
	//				x++;
	//		}
	//		System.out.println();
	//
	//	}
	//}
	//}

	//	to print
	//	    5
	//	   545
	//	  54345
	//	 5432345
	//	543212345

	//	static void star(int n)
	//	{
	//		for(int i=1;i<=n;i++)
	//		{
	//			for(int j=1;j<=n-i;j++)
	//			{
	//				System.out.print(" ");
	//			}
	//			int x=n;
	//			for(int j=1;j<=i*2-1;j++)
	//			{
	//				System.out.print(x);
	//				if(j<i)
	//					x--;
	//				else
	//					x++;
	//						}
	//			System.out.println();
	//		
	//	}
	//	}
	//}
	// to print
	//	       * 
	//       * * * 
	//      * * * * * 
	//    * * * * * * * 
	//   * * * * * * * * * 
	// * * * * * * * * * * * 
	//   * * * * * * * * * * * * * 
	// * * * * * * * * * * * 
	//   * * * * * * * * * 
	//     * * * * * * * 
	//      * * * * * 
	//        * * * 
	//          * 
	//
	//	static void star(int n)
	//	{

	//		int sp=n/2;
	//		int st=1;
	//		for(int i=1;i<=n;i++)
	//		{
	//			for(int j=1;j<=sp;j++)
	//			{
	//				System.out.print("  ");	
	//			}
	//			for(int j=1;j<=st;j++)
	//
	//			{
	//				System.out.print("* ");
	//			}
	//			if(i<=n/2)
	//			{
	//				sp--;
	//				st=st+2;
	//			}
	//			else {
	//				sp++;
	//				st=st-2;
	//			}
	//			System.out.println();
	//		}
	//	}
	//}

	//to print
	//	* * * * * * * * * * * * * 
	//	  * * * * * * * * * * * 
	//	    * * * * * * * * * 
	//	      * * * * * * * 
	//	        * * * * * 
	//	          * * * 
	//	            * 
	//	          * * * 
	//	        * * * * * 
	//	      * * * * * * * 
	//	    * * * * * * * * * 
	//	  * * * * * * * * * * * 
	//	* * * * * * * * * * * * * 

	//	static void star(int n)
	//	{
	//		int sp=0;
	//		int st=n;
	//		for(int i=1;i<=n;i++)
	//		{
	//			for(int j=1;j<=sp;j++)
	//			{
	//				System.out.print("  ");	
	//			}
	//			for(int j=1;j<=st;j++)
	//
	//			{
	//				System.out.print("* ");
	//			}
	//			if(i<=n/2)
	//			{
	//				sp++;
	//				st=st-2;
	//			}
	//			else {
	//				sp--;
	//				st=st+2;
	//			}
	//			System.out.println();
	//		}
	//	}
	//}

	//to print
	//    * 
	//  *   * 
	//*       * 
	//*        * 
	//*       * 
	//  *   * 
	//    * 
	//	static void star(int n)
	//	{
	//		int sp=n/2;
	//		int st=1;
	//
	//		for(int i=1;i<=n;i++)
	//		{
	//			for(int j=1;j<=sp;j++)
	//			{
	//				System.out.print("  ");
	//			}
	//			for(int j=1;j<=st;j++)
	//			{if(j==1||j==st)
	//				System.out.print("* ");
	//			else
	//				System.out.print("  ");
	//			}
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
	//		}
	//	}
	//}

	//	static void star(int n)
	//	{
	//		int sp=n/2;
	//		int st=1;
	//		for(int i=1;i<n;i++)
	//		{
	//			for(int j=1;j<=sp;j++)
	//			{
	//				System.out.print("  ");
	//			}
	//			for(int j=1;j<=st;j++)
	//			{
	//				System.out.print(j);
	//
	//				if(j<st)
	//					
	//					System.out.print("* ");	
	//				if(j<=n/2)
	//				{
	//					sp--;
	//					st++;
	//				}
	//				else
	//				{
	//					sp++;
	//					st--;
	//				}
	//			}
	//		
	//			System.out.println();
	//		}
	//	}
	//}
	// to print
	//	* * * * * * * 
	//	* *       * * 
	//	*   *   *   * 
	//	*     *     * 
	//	*   *   *   * 
	//	* *       * * 
	//	* * * * * * * 
	//	static void star(int n )
	//	{
	//		for(int i=1;i<=n;i++)
	//		{
	//			for(int j=1;j<=n;j++)
	//			{
	//				if(i==1||i==n||j==1||j==n||i==j||i+j==n+1)
	//					System.out.print("* ");
	//				else
	//					System.out.print("  ");
	//			}
	//			System.out.println();
	//		}
	//	}
	//}

	//	* * * * * 
	//	*   *   * 
	//	* * * * * 
	//	*   *   * 
	//	* * * * * 
	//	static void star(int n)
	//	{
	//		for(int i=1;i<=n;i++)
	//		{
	//			for(int j=1;j<=n;j++)
	//			{
	//				if(i==1||i==n||j==1||j==n||i==n/2+1||j==n/2+1)
	//					System.out.print("* ");
	//				else
	//					System.out.print("  ");
	//			}
	//				System.out.println();
	//			}
	//		}
	//	}

	//	11 21 31 41 51 
	//	12 22 32 42 52 
	//	13 23 33 43 53 
	//	14 24 34 44 54 
	//	15 25 35 45 55 
	//	static void star(int n)
	//	{
	//		for(int i=1;i<=n;i++)
	//		{
	//			for(int j=1;j<=n;j++)
	//			{
	//	System.out.print(j+""+i+" ");
	//			}
	//		System.out.println();
	//		}
	//	}
	//}
	//to print
	//	*       *       * 
	//	  *     *     *   
	//	    *   *   *     
	//	      * * *       
	//	* * * * * * * * * 
	//	      * * *       
	//	    *   *   *     
	//	  *     *     *   
	//	*       *       * 

	//	static void star(int n)
	//	{
	//		for(int i=1;i<=n;i++)
	//		{
	//			for(int j=1;j<=n;j++)
	//			{
	//				if(i==n/2+1||j==n/2+1||i==j||i+j==n+1)
	//				System.out.print("* ");
	//				else
	//					System.out.print("  ");
	//			}
	//			System.out.println();
	//		}
	//	}
	//}


	//        1 
	//      1 2 1 
	//    1 2 3 2 1 
	//  1 2 3 4 3 2 1 
	//1 2 3 4 5 4 3 2 1 
	//  1 2 3 4 3 2 1 
	//    1 2 3 2 1 
	//      1 2 1 
	//        1 

	//	static void star(int n)
	//	{ int sp=n/2;
	//	int st = 1;
	//      
	//       
	//	for(int i=1;i<=n;i++)
	//	{
	//		for(int j=1;j<=sp;j++)
	//		{
	//			System.out.print("  ");
	//		}int x=1;
	//		for(int j=1;j<=st;j++)
	//		{
	//				System.out.print(x+" ");
	//			if(j<=st/2)
	//				x++;
	//			else
	//				x--;
	//		}
	//			if(i<=n/2)
	//			{
	//				sp--;
	//				st=st+2;
	//                
	//			}
	//			else
	//			{
	//				sp++;
	//				st=st-2;
	//			}
	//		
	//
	//		System.out.println();	
	//	}
	//	}
	//
	//}


	static void star(int n)
	{ 
		for (int i = 0; i <n; i++) 
		{
			int k=1;
			for (int j = 1; j < n; j++) 
			{
				System.out.print(k+" ");
				k++;
			}
System.out.println();
		}	
	}
}


