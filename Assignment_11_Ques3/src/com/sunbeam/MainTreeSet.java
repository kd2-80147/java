package com.sunbeam;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MainTreeSet {

	public static void main(String[] args) {
		class Compare implements Comparator<Book>{
			@Override
			public int compare(Book b1, Book b2) {
				int diff = b1.getIsbn().compareTo(b2.getIsbn());
				return diff;
			}
		}
	/*	
		Set<Book> set = new TreeSet<>();

		set.add(new Book("b1", 110.0, "Shikhar", 10));
		set.add(new Book("b4", 140.0, "Prahwal", 6));
		set.add(new Book("b2", 120.0, "Bhanu", 11));
		set.add(new Book("b3", 130.0, "Abhey", 8));
		set.add(new Book("b5", 150.0, "Shubham", 4));
		set.add(new Book("b5", 150.0, "Shubham", 4));

		Iterator<Book> itr = set.iterator();
		while (itr.hasNext()) {
			Book b1 = itr.next();
			System.out.println(b1);
		}
	*/
		Compare cmp = new Compare();
		Set<Book> set = new TreeSet<>(cmp);

		set.add(new Book("b1", 110.0, "Shikhar", 10));
		set.add(new Book("b4", 140.0, "Prahwal", 6));
		set.add(new Book("b2", 120.0, "Bhanu", 11));
		set.add(new Book("b3", 130.0, "Abhey", 8));
		set.add(new Book("b5", 150.0, "Shubham", 4));
		set.add(new Book("b5", 150.0, "Shubham", 4));

		Iterator<Book> itr = set.iterator();
		while (itr.hasNext()) {
			Book b1 = itr.next();
			System.out.println(b1);
		}
	}
}
/*
Without Using hashCode() the elements cannot be Duplicated Because it requires 
Comparable interface or Comparator interface functions to compare and without providing them 


Books are Stored in the Sorted Order

Implementing Comparable or Comparator functions TreeSet Removes duplicate values 
*/