package com.jsp.test;

import java.util.Scanner;

public class Students 
{
	private Integer Studentid;
	private String Studentname;
	private Integer Physics;
	private Integer Chemistry;
	private Integer Mathematics;
	private Integer Biology;
	public String getStudentname() {
		return Studentname;
	}
	public void setStudentname(String studentname) {
		Studentname = studentname;
	}
	public Integer getPhysics() {
		return Physics;
	}
	public void setPhysics(Integer physics) {
		Physics = physics;
	}
	public Integer getChemistry() {
		return Chemistry;
	}
	public void setChemistry(Integer chemistry) {
		Chemistry = chemistry;
	}
	public Integer getMathematics() {
		return Mathematics;
	}
	public void setMathematics(Integer mathematics) {
		Mathematics = mathematics;
	}
	public Integer getBiology() {
		return Biology;
	}
	public void setBiology(Integer biology) {
		Biology = biology;
	}
	public Integer getStudentid() {
		return Studentid;
	}
	public Students(Integer studentid, String studentname, Integer physics, Integer chemistry, Integer mathematics,
			Integer biology) {
		super();
		Studentid = studentid;
		Studentname = studentname;
		Physics = physics;
		Chemistry = chemistry;
		Mathematics = mathematics;
		Biology = biology;
	}

	public Integer total()
	{
		return (Biology+Mathematics+Chemistry+Physics);
	}
	public double percentage()
	{
		return total()/4.0;
	}
	public String result()
	{

		if(Biology<35||Chemistry<35||Mathematics<35||Physics<35)
			return "fail";

		double per=percentage();
		if(per>=85)
			return "distinction";
		if(per>=60)
			return "first class";
		if(per>=50)
			return "second class";
		return "pass";

	}
	@Override
	public String toString() {
		return "Students [Studentid=" + Studentid + ", Studentname=" + Studentname + ", Physics=" + Physics
				+ ", Chemistry=" + Chemistry + ", Mathematics=" + Mathematics + ", Biology=" + Biology + ", total()="
				+ total() + ", percentage()=" + percentage() + ", result()=" + result() + "]";
	}

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the number of students");
		int n =sc.nextInt();

		Students[] stu = new Students[n];

		for(int i=0;i<n;i++)
		{
			System.out.println("Enter student name: ");
			String name = sc.next();
			System.out.println("Enter student id: ");
			int id=sc.nextInt();
			System.out.println("Enter physics marks: ");
			int py=sc.nextInt();
			System.out.println("Enter chemistry marks: ");
			int ch=sc.nextInt();
			System.out.println("Enter mathematics marks: ");
			int mat=sc.nextInt();
			System.out.println("Enter biology marks: ");
			int bio=sc.nextInt();


			stu[ i]= new Students(id, name,py,mat, ch,bio);
		}
		System.out.println("----------------Student result----------------");
		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i]);
		}

		Students hs = higestpercentage(stu);
		System.out.println("highest percentage student is");
		System.out.println(hs);
	}
	
	static int getnoofdistinction(Students[] stu)
	{
		int count=0;
		for (int i = 0; i < stu.length; i++) {
			if(stu[i].result().equals("distinction"));
		}
		return count;
	}

	static Students higestpercentage(Students[] stu) {
		Students hs = stu[0];
		for (int i = 0; i < stu.length; i++) {
			if(stu[i].percentage()>stu[i].percentage())
				hs=stu[i];
		}
		return hs;
	}
}
