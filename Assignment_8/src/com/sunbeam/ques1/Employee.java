package com.sunbeam.ques1;

import java.util.Scanner;

abstract public class Employee implements Person {
	String name;
	protected int id;
	protected float sal;

	public Employee() {
		this.id = 0;
		this.sal = 0;
	}

	public Employee(int id, float sal) {
		this.id = id;
		this.sal = sal;
	}

	int get_id() {
		return this.id;
	}

	float get_sal() {
		return this.sal;
	}

	void set_id(int id) {
		this.id = id;
	}

	void set_sal(float sal) {
		this.sal = sal;
	}
	@Override
	public void accept() {
		System.out.println("Enter the id: ");
		this.id = new Scanner(System.in).nextInt();
		System.out.println("Enter the name : ");
		this.name = new Scanner(System.in).next();
		System.out.println("Enter the Salary: ");
		this.sal = new Scanner(System.in).nextFloat();

	}
	@Override
	public void display() {
		System.out.println("The details are: ");
		System.out.println("The id is: " + this.id);
		System.out.println("The Name of the employee is : " + this.name);
		System.out.println("The salary is: " + this.sal);
	}

	abstract public double totalSalary();
}
