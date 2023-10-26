package com.sunbeam;

import java.util.Scanner;
import java.util.stream.Stream;

public class MainStreamOperations {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the Number : ");
		int num = scan.nextInt();

		Stream<Integer> strm = Stream.iterate(1,x -> x + 1).limit(num);
		int ans = strm.reduce(1, (a,e) -> a*e);
		System.out.println("The factorial of the " + num + " is " + ans);
		
		scan.close();

	}

}
