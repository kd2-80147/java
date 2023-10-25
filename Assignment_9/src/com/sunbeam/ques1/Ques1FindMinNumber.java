package com.sunbeam.ques1;

public class Ques1FindMinNumber {
	public static <T extends Number> T findMin(T[] arr) {
		T min;
		min = arr[0];
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(min.doubleValue() > arr[i].doubleValue())
				min  = arr[i];
		}
	
		return min;
	}

	public static void main(String[] args) {
		Integer[] arr1 = { 22, 55, 77, 11, 33 };
		Integer min1 = findMin(arr1);
		System.out.println(min1);
		System.out.println();
		Double[] arr2 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
		Double min2 = findMin(arr2);
		System.out.println(min2);
		System.out.println();
	}

}
