package com.sunbeam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainQues1 {

	static int menu(Scanner scan) {
		int choice;

		System.out.println("************************************************************");
		System.out.println("0. EXIT");
		System.out.println("1. Add new book in list.");
		System.out.println("2. Display all books in forward order using random access");
		System.out.println("3. Search a book with given isbn");
		System.out.println("4. Delete a book at given index.");
		System.out.println("5. Delete a book with given isbn.");
		System.out.println("6. Reverse the list");
		System.out.println("7. Save the Books in a file");
		System.out.println("6. Load the Books from a file");
		System.out.println("************************************************************");
		System.out.print("Enter Your Choice : ");
		choice = scan.nextInt();
		System.out.println("************************************************************");

		return choice;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Book> arr = new ArrayList<>();
		int choice;

		while ((choice = menu(scan)) != 0) {
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

				Book key = new Book(isbn, price, author, qty);

				if (arr.contains(key)) {
					int i = arr.indexOf(key);
					Book b = arr.get(i);
					b.setQuantity(b.getQuantity() + 1);
				} else
					arr.add(key);
				break;

			case 2:
				Collections.shuffle(arr);
				Iterator<Book> itr = arr.iterator();
				while (itr.hasNext()) {
					Book b1 = itr.next();
					System.out.println(b1);
				}
				break;

			case 3:
				System.out.print("Enter Isbn : ");
				isbn = new Scanner(System.in).next();
				Book key1 = new Book(isbn, 0.0, "", 0);
				if (arr.contains(key1)) {
					int index = arr.indexOf(key1);
					Book b2 = arr.get(index);
					System.out.println(b2);
				}

				break;

			case 4:
				System.out.println("Enter the index : ");
				int index = new Scanner(System.in).nextInt();
				arr.remove(index);
				System.out.println("The Element at the index " + index + " deleted!!");
				break;

			case 5:
				System.out.print("Enter Isbn : ");
				isbn = new Scanner(System.in).next();
				Book key2 = new Book(isbn, 0.0, "", 0);
				if (arr.contains(key2)) {
					int index1 = arr.indexOf(key2);
					arr.remove(index1);
					System.out.println("The Book with Isbn :  " + isbn + " deleted!!");
				}
				break;

			case 6:
				Collections.reverse(arr);
				System.out.println("Reveresed List: " + arr);
				Collections.reverse(arr);
				break;
			case 7: // Save the books in a file
				try (FileOutputStream fout = new FileOutputStream("books.txt")) {
					try (DataOutputStream dout = new DataOutputStream(fout)) {

						for (Book ele : arr) {
							dout.writeUTF(ele.getIsbn());
							dout.writeDouble(ele.getPrice());
							dout.writeUTF(ele.getAuthorName());
							dout.writeInt(ele.getQuantity());
						}
					} // dout.close();
				} // fout.close();
				catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 8:// Load a file
				List<Book> list = new ArrayList<Book>();
				try (FileInputStream fin = new FileInputStream("books.txt")) {
					try (DataInputStream din = new DataInputStream(fin)) {
						
						while(true) {
							Book book = new Book();
							book.setIsbn(din.readUTF());
							book.setPrice(din.readDouble());
							book.setAuthorName(din.readUTF());
							book.setQuantity(din.readInt());
							list.add(book);
						}
					} // din.close();
				} // fin.close();
				catch(EOFException e) {
					System.out.println("File Successfully Loaded!!");
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(list);
				break;

			default:
				System.out.println("Invalid Choice....Try Again!!");
				break;
			}
		}
		System.out.println("Thank you for using the application!!");
	}

}
