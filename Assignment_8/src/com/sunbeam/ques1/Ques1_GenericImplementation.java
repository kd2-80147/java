package com.sunbeam.ques1;

public class Ques1_GenericImplementation {
	public static void main(String[] args) {
		Manager m = new Manager();
		m.accept();
		m.display();
		Box<Manager> b1 = new Box<>();
		b1.setObj(m);
		System.out.println("The Total Salary of the Manager is: " + b1.getTotalSalary());
		
		Salesman s = new Salesman();
		s.accept();
		s.display();
		Box<Employee> b2 = new Box<>();
		b2.setObj(s);
		System.out.println("The total salary for Salesman is: " + b2.getTotalSalary());
	}

}
