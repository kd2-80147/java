package com.sunbeam;

import java.util.Scanner;

public class MainQues5 {
	public static <T> int repeatingElement(T[] arr, T key, Check<T> c) {
		int count = 0;
		
		for(T ele : arr) {
			if(c.compare(ele, key)) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
		Double arr[] = {1.1, 2.2, 3.3, 4.5, 5.1, 5.3, 3.3, 4.5, 5.1};
		
		System.out.print("Enter the Key : ");
		Double key = scan.nextDouble();
		int res = repeatingElement(arr,key,(a,b) -> Double.compare(a, b) == 0);
		System.out.println("The element = " + key + " is repeated -- " + res + " times");
		
		scan.close();
	}
}
