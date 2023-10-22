package tester;

import com.sunbeam.assignment.Employee_Ques_2;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee_Ques_2 emp1 = new Employee_Ques_2("Sam", "Smith", 2000);
		Employee_Ques_2 emp2 = new Employee_Ques_2("Scott", "James", 3000);
		
		String name = emp1.getFirst_Name();
		System.out.println("The First Name of the Employee is: " + name);
		name = emp1.getLast_Name();
		System.out.println("The Last Name of the Employee is: " + name);
		double sal = emp1.getSalary();
		System.out.println("The salary for the employee " + emp1.getFirst_Name() + " is: " + sal);
		
		System.out.println();
		System.out.println("The First Name of the Employee is: " + emp2.getFirst_Name());
		System.out.println("The Last Name of the Employee is: " + emp2.getLast_Name());
		System.out.println("The salary for the employee " + emp2.getFirst_Name() + " is: " + emp2.getSalary());
		
		sal = emp1.getSalary();
		double sal2 = emp2.getSalary();
		
		emp1.setSalary(sal + sal*0.10);
		emp2.setSalary(sal2+sal2*0.10);
		System.out.println();
		System.out.println("The salary for the employee " + emp1.getFirst_Name() + " is: " + emp1.getSalary());
		System.out.println("The salary for the employee " + emp2.getFirst_Name() + " is: " + emp2.getSalary());
		
		

	}

}
