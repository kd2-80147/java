package com.sunbeam.ques1;

import java.util.Scanner;

public class Salesman extends Employee{
	protected float comm;

	protected void accept_salesman()
	    {
	        System.out.println("Enter the commission: ");
	        this.comm = new Scanner(System.in).nextFloat();
	    }

	protected void display_salesman()
	    {
	       System.out.println("The commission is: " + this.comm);
	    }

	public Salesman()
	    {
	        super.id = 0;
	        super.sal = 0;
	        super.name = "";
	        this.comm = 0;
	    }

	public Salesman(int id, float sal, float comm, String name)
	    {
	        super.id = id;
	        super.sal = sal;
	        super.name = name;
	        this.comm = comm;
	    }

	public float get_comm()
	    {
	        return this.comm;
	    }

	public void set_comm(float comm)
	    {
	        this.comm = comm;
	    }
	@Override
	public void accept()
	    {
	        super.accept();
	        System.out.println("Enter the commission for the salesman: ");
	        this.comm  = new Scanner(System.in).nextFloat();
	    }
	@Override
	public void display()
	    {
	        super.display();
	        System.out.println("\nThe commission for the salesman is: " + this.comm); 
	    }

	@Override
	public double totalSalary() {
		double salary;
		salary = this.comm + super.sal;
		//System.out.println("The total salary is : " + salary);
		return salary;
	}
}
