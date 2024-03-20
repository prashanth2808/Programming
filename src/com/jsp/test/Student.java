package com.jsp.test;

import java.util.Scanner;

public class Student {
private int age;
public void setAge(int age) {
 if(age>0) {
 System.out.println("Age Initialized");
 this.age = age;
 }
 else {
 System.out.println("Age Cannot be Initialized");
 }
 }
public int getAge() {
 return age;
 }

public static void main(String[] args) {
	Scanner sc = new  Scanner(System.in);
			
	Student ss = new  Student();
	System.out.println("Enter the age");
			int age= sc.nextInt();
			ss.setAge(age);
			System.out.println(ss.getAge());
	
}
}
