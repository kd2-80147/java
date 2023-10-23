package employeesal;

import java.util.Scanner;

public class CommisionedEmployee extends SalaryCalculator {
	
	double commissionRate;
	double grossSales;
	
	
	
	public CommisionedEmployee() {
		super();
	}

	public CommisionedEmployee(int sSN, String fname, String lname, double commissionRate,
			double grossSales) {
		super(sSN, fname, lname);
		this.commissionRate = commissionRate;
		this.grossSales = grossSales;
	}

	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter commissionRate :");
		commissionRate=sc.nextDouble();	
		System.out.println("Enter grossSales:");
		grossSales=sc.nextDouble();	
	}

	
	@Override
	public String toString() {
		return "commisionEmp" + " weeklySal="
				+ ", SSN=" + SSN + ", fname=" + fname + ", lname=" + lname+", commissionRate=" + commissionRate + ", grossSales=" + grossSales  ;
	}
	
	@Override
	public double salCalc() {
		
			return grossSales*commissionRate;
		
	}
	

}
