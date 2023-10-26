package com.sunbeam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MainLinkedHashMap {
	static int menu(Scanner scan) {
		int choice;
		
		System.out.println("***************************");
		System.out.println("0. EXIT");
		System.out.println("1. ADD STUDENT");
		System.out.println("2. FIND STUDENT");
		System.out.println("***************************");
		System.out.println("Enter Your Choice....");
		choice = scan.nextInt();
		
		return choice;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<Integer,Student> map = new LinkedHashMap<>();
		int choice;
		while((choice = menu(scan)) != 0) {
			switch(choice) {
			case 1: //Add
				System.out.print("Enter Rollno : ");
				int rollno = scan.nextInt();
				System.out.print("Enter Name : ");
				String name = scan.next();
				System.out.print("Enter Marks : ");
				double marks = scan.nextDouble();
				
				Student s = new Student(rollno,name,marks);
				map.put(s.getRollno(), s);
				break;
				
			case 2: //Find
				System.out.print("Enter the Roll no of the Student to Search : ");
				rollno = scan.nextInt();
				Student s1 = map.get(rollno);
				System.out.println("The Student with Rollno : " + rollno + " is " + s1);

				break;
				
			default:
				break;
			}
		}	
		System.out.println("Thank You for using the application...!!");
		scan.close();
	}

}
