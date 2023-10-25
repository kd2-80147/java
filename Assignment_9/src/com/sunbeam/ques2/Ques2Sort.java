package com.sunbeam.ques2;

import java.util.Comparator;

public class Ques2Sort implements Comparator<Number>{

	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			} 
		}
	}

	public static void main(String[] args) {
		
		Double arr[] = {7.7, 6.6, 5.5, 4.4, 3.3, 2.2, 1.1};
		selectionSort(arr, new Ques2Sort());
		System.out.println("After Sort : ");
		
		for(Double ele : arr) {
			System.out.print(ele + " ");
		}
	}

	@Override
	public int compare(Number arg0, Number arg1) {
		if(arg0.doubleValue() >  arg1.doubleValue())
			return 1;
		else 
			return 0;
	}
}
