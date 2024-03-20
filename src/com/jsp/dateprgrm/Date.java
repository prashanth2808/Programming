package com.jsp.dateprgrm;

import java.util.Arrays;

public class Date {

	int dd;
	int mm;
	int yy;
	int month[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	String[] dname= {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
	public Date(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;

		if(yy%400==0||yy%4==0 && yy%100!=0)
			month[2]=29;

	}
	public int countdays()
	{
		int days=dd;
		for(int i=1;i<mm;i++)
			days=days+month[i];
		int y=yy-1;

		days=days+y+365;
		days=days+y/400+y/4-y/100;
		return days;
	}
	
	@Override
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + ", month=" + Arrays.toString(month) + ", dname="
				+ Arrays.toString(dname) + "]";
	}
	public String getdayname()
	{
		int x=countdays();
		return dname[x%7];
	}
}
