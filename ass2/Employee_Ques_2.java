package com.sunbeam.assignment;

public class Employee_Ques_2 {
	String first_Name;
	String last_Name;
	double salary;
	public Employee_Ques_2() {
		super();
	}
	public Employee_Ques_2(String first_Name, String last_Name, double salary) {
		super();
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.salary = salary;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
