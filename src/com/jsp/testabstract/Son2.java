package com.jsp.testabstract;

public  class Son2 extends Son1{
void son2()
{
	System.out.println("Suresh");
	
}
public static void main(String[] args) {
	Son2 s = new Son2(); 
	s.father();
	s.son1();
	s.son2();
}

}
