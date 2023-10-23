package employeesal;

import java.util.Scanner;

public class SalariedEmployee extends SalaryCalculator {
	
	double weeklySal;
    
	public SalariedEmployee() {
		// TODO Auto-generated constructor stub
	}

	public SalariedEmployee(int sSN, String fname, String lname, double weeklySal) {
	super(sSN, fname, lname);
	this.weeklySal = weeklySal;
}

	public double getWeeklySal() {
		return weeklySal;
	}


	public void setWeeklySal(double weeklySal) {
		this.weeklySal = weeklySal;
	}

	@Override
	public  void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter weekly salary :");
		weeklySal=sc.nextDouble();	
	}
	
	public void display() {
		System.out.println("Weekly salary :"+weeklySal);		
	}
	
	@Override
	public double salCalc() {
		return weeklySal;
	}

	@Override
	public String toString() {
		return "Salaried Employee"+ ", SSN=" + SSN + ", fname=" + fname + ", lname=" + lname+", weeklySal=" + weeklySal ;
	}
	

}
