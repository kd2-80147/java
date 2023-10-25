package com.sunbeam.ques3;

import java.util.Arrays;
import java.util.Comparator;

public class Ques3ArraySortByLevel {

	public static void main(String[] args) {
	Student arr[] = new Student[5];
		arr[0] = new Student(1,"Shikhar","Noida",90);
		arr[1] = new Student(2,"Bhanu","Karad",80);
		arr[2] = new Student(3,"Abhey","Pune",90);
		arr[3] = new Student(4,"Prajwal","Pune",70);
		arr[4] = new Student(5,"Shashank","Noida",90);
		
		//Arrays.sort(arr);
		
		class Compare implements Comparator<Student>{
			@Override
			public int compare(Student s1, Student s2) {
				int diff = -s1.getCity().compareTo(s2.getCity());
				if(diff == 0) 
					diff = -Double.compare(s1.getMarks(),s2.getMarks());
				if(diff == 0)
					diff = s1.getName().compareTo(s2.getName());
				return diff;
			}
		}
		Compare comparator = new Compare();
		Arrays.sort(arr,comparator);
		for(Student e : arr)		
			System.out.println(e);
	}

}
