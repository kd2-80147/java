package com.sunbeam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainHashMap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String,Book> map = new HashMap<>();
		
		Book b = new Book("b1",100.0,"Shikhar",10);
		map.put(b.getIsbn(), b);
		
		b = new Book("b2",120.0,"Prajwal",9);
		map.put(b.getIsbn(), b);
		
		b = new Book("b3",140.0,"Abhey",8);
		map.put(b.getIsbn(), b);
		
		b = new Book("b4",160.0,"Bhanu",11);
		map.put(b.getIsbn(), b);
		
//		b = new Book("b4",160.0,"Bhanu",11);
//		Book b1 = map.put(b.getIsbn(), b);
		//System.out.println(b1);
		
		System.out.print("Enter the Isbn of the book you wantr to search : ");
		String str = scan.next();
		Book b1 = map.get(str);
		System.out.println("The Book with Isbn " + str + " is " + b1);
		
		scan.close();
		
	}

}
/*
We do not need to write hashCode() and equals() because for String these functions are 
already provided in the string classes.
*/