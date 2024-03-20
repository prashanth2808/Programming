package com.jsp.arraysprgms;

public class MainArr {
	public static void main(String[] args) {


		Arrayoperations ao= new Arrayoperations();

		System.out.println("read first array");	
		int[] fa = ao.readArray();

		System.out.println("read second array");	
		int[] fb = ao.readArray();


		int[] z=ao.merge(fa, fb);


		System.out.println("user entered first array is ");
		ao.dispArray(fa);

		System.out.println("user entered first array is ");
		ao.dispArray(fb);

		System.out.println("combined array is ");
		ao.dispArray(z);
	}
	}
