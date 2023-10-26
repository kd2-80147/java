package com.sunbeam;

import java.util.Scanner;

public class MainQues3 {

	static void calculate(double num1, double num2, Arithmetic op){
		double result = op.calc(num1, num2);
		System.out.println("Result: " + result);
	}
	
	static int menu(Scanner scan) {
		int choice;
		
		System.out.println("***********************");
		System.out.println("0. EXIT");
		System.out.println("1. ADD");
		System.out.println("2. SUBTRACT");
		System.out.println("3. DIVIDE");
		System.out.println("4. MULTIPLY");
		System.out.println("***********************");
		System.out.print("Enter your Choice : ");
		choice = scan.nextInt();
		System.out.println("***********************");
		
		return choice;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice;
		double x, y;
		
		while((choice = menu(scan)) != 0) {
			switch(choice) {
			
			case 1: //Add
				System.out.print("Enter Two Numbers : ");
				x = scan.nextDouble();
				y = scan.nextDouble();
				calculate(x, y, (a,b) -> a + b);
				break;
			
			case 2://Subtract
				System.out.print("Enter Two Numbers : ");
				x = scan.nextDouble();
				y = scan.nextDouble();
				calculate(x, y, (a,b) -> a - b);
				break;
			
			case 3: //Divide
				System.out.print("Enter Two Numbers : ");
				x = scan.nextDouble();
				y = scan.nextDouble();
				calculate(x, y, (a,b) -> a / b);
				break;
				
			case 4: //Multiply
				System.out.print("Enter Two Numbers : ");
				x = scan.nextDouble();
				y = scan.nextDouble();
				calculate(x, y, (a,b) -> a * b);
				break;
				
			default:
				System.out.println("Invali choice....Try Again!!!");
				break;
			}
		}
		System.out.println("Thank you for using the application...!!");
		scan.close();
	}

}
