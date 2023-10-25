package com.sunbeam.ques1;

import java.util.Scanner;

public class TestException {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		ReadString readString = new ReadString();
		String line = scan.next();
		try {
		readString.setLine(line);
		System.out.println(readString);
		} 
		catch(ExceptionLineTooLong error) {
			System.out.println(error);
		}
		
		scan.close();
	}

}
