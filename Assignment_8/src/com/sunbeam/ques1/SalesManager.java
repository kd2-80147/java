package com.sunbeam.ques1;

import java.util.Scanner;

public class SalesManager extends Manager {
	protected float comm;

	public SalesManager() {
		super.id = 0;
		super.sal = 0;
		super.bonus = 0;
		this.comm = 0;
	}

	public SalesManager(int id, float sal, float bonus, float comm) {
		super.id = id;
		super.sal = sal;
		super.bonus = bonus;
		this.comm = comm;
	}
	@Override
	public void accept() {
		super.accept();
		this.comm = new Scanner(System.in).nextFloat();
	}
	@Override
	public void display() {
		super.display();
		System.out.println("The Commission is: " + this.comm);

	}
	@Override
	public double totalSalary() {
		double salary;
		salary = this.comm + super.sal + super.bonus;
		System.out.println("The Total Salary is : " + salary);
		return salary;
	}
}
