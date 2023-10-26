package com.sunbeam;

import java.util.stream.IntStream;

public class MainQues8 {

	public static void main(String[] args) {
		IntStream strm = IntStream.range(1, 10);
		
		int total = strm.sum();
		System.out.println(total);
		
		IntStream strm1 = IntStream.range(1, 10);
		System.out.println(strm1.summaryStatistics());
	}

}
