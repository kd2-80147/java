package com.sunbeam.ques4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListTester {

	static int menu() {
		int choice;

		System.out.println("********************************************");
		System.out.println("0. EXIT");
		System.out.println("1. Add new book in list.");
		System.out.println("2. Display all books in forward order.");
		System.out.println("3. Delete at book given index"); // -- list.remove(index);
		System.out.println("4. Check if book with given isbn is in list or not");
		System.out.println("5. Delete all books in list");
		System.out.println("6. Display number of books in list");
		System.out.println("7. Sort all books by price in desc order"); // -- list.sort();
		System.out.println("********************************************");
		System.out.print("Enter Your Choice : ");
		choice = new Scanner(System.in).nextInt();
		System.out.println("********************************************");

		return choice;
	}

	public static void main(String[] args) {
		ArrayList<Book> arr = new ArrayList<>();
		int choice;
		
		class Compare implements Comparator<Book>{

			@Override
			public int compare(Book b1, Book b2) {
				int diff = -b1.getIsbn().compareTo(b2.getIsbn());
				return diff;
			}
			
		}

		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				System.out.print("Enter Isbn : ");
				String isbn = new Scanner(System.in).next();
				System.out.print("Enter price : ");
				double price = new Scanner(System.in).nextDouble();
				System.out.print("Enter Author : ");
				String author = new Scanner(System.in).next();
				System.out.print("Enter Quantity : ");
				int qty = new Scanner(System.in).nextInt();
				arr.add(new Book(isbn, price, author, qty));
				break;

			case 2:
				for (Book book : arr) {
					System.out.println(book);
				}
				break;
				
			case 3:
				System.out.println("Enter the index : ");
				int index = new Scanner(System.in).nextInt();
				arr.remove(index);
				System.out.println("The Element at the index " + index + " deleted!!");
				break;
				
			case 4: 
				System.out.println("Enter the isbn : ");
				isbn = new Scanner(System.in).next();
				Book b1 = new Book(isbn,0.0,"",0);
				if(arr.contains(b1))
					System.out.println("The Element is in the list!");
				else 
					System.out.println("The Element is not in the list!");
				break;
				
			case 5:
				arr.clear();
				System.out.println("The List is cleared!!");
				break;
			
			case 6: 
				System.out.println("The Number of Books in the ArrayList is : " + arr.size());
				break;
			
			case 7:	
				Compare c = new Compare();
				arr.sort(c);
				for (Book book : arr) {
					System.out.println(book);
				}
				break;
			}
		}
		System.out.println("Thank you for using the application!!");

	}

}
