package com.sunbeam;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class MainLinkedHashSet {

	public static void main(String[] args) {
		Set<Book> set = new LinkedHashSet<>();

		set.add(new Book("b1", 110.0, "Shikhar", 10));
		set.add(new Book("b2", 120.0, "Bhanu", 11));
		set.add(new Book("b3", 130.0, "Abhey", 8));
		set.add(new Book("b4", 140.0, "Prahwal", 6));
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
Without Using hashCode() the elements in the set can be duplicated

Books are Stored in the order of the Insertion in the set

Using hashCode() the elements in the Set can not be duplicated
*/