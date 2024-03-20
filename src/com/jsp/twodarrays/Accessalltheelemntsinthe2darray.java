package com.jsp.twodarrays;

import java.util.Iterator;

public class Accessalltheelemntsinthe2darray {
	public static void main(String[] args) {

		int[] std[]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		System.out.println("Length of 2d array");

		System.out.println(std.length);
		System.out.println("Length of each array");

		System.out.println(std[0].length);
		System.out.println(std[1].length);
		System.out.println(std[2].length);



		for (int i = 0; i < std.length; i++) 
		{
			System.out.println("elements in each array");

			for (int j = 0; j < std[i].length; j++) 
			{

				System.out.print(std[i][j]+" ");

			}
			System.out.println();
		}
	}

}
