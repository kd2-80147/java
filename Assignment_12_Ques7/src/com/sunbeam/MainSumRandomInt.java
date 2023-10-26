package com.sunbeam;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class MainSumRandomInt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		System.out.print("How many random numbers? ");
		int num = scan.nextInt();
		Stream<Integer> strm = Stream.generate(() -> r.nextInt(100)).limit(num);
		
		int ans = strm.reduce(0, (a,e) -> a + e);
		System.out.println("The sum of Random Numbers is : " + ans);
		
		scan.close();
	}

}
