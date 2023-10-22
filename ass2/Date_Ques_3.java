package com.sunbeam.assignment;

public class Date_Ques_3 {
	int day;
	int month;
	int year;
	public Date_Ques_3() {
		super();
	}
	public Date_Ques_3(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void displaydate() {
		System.out.println("Date is : " + this.day + "/" + this.month + "/" + this.year);
	}

}
