package employeesal;

import java.util.Scanner;

public class PayrollCalculator {
	
	public static void main(String[] args) {
		
		SalaryCalculator Emp=null;
		
		Emp=new SalariedEmployee();	
		Emp.accept(new Scanner(System.in));
		System.out.println(Emp.toString());
		System.out.println("Employee salary is: "+Emp.salCalc());
		
		
		Emp=new HourlyEmployee();
		Emp.accept(new Scanner(System.in));
		System.out.println(Emp.toString());
		System.out.println("Employee salary is: "+Emp.salCalc());

		
		Emp=new CommisionedEmployee();
		Emp.accept(new Scanner(System.in));
		System.out.println(Emp.toString());
		System.out.println("Employee salary is: "+Emp.salCalc());

	
		Emp=new BaseSlariedCommisionedEmployee();
		Emp.accept(new Scanner(System.in));
		System.out.println(Emp.toString());
		System.out.println("Employee salary is: "+Emp.salCalc());
		System.out.println("Reward to salaried-commission employees by adding 10% to their base salaries");
		BaseSlariedCommisionedEmployee BPE=(BaseSlariedCommisionedEmployee) Emp;
		BPE.addRewardSal();
		System.out.println("After Reward 10% .Employee salary is: "+Emp.salCalc());
	}

}
