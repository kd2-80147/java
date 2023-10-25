package com.sunbeam;

public class Ques4_StringWordCount {

	public static void main(String[] args) {
		String s1 = new String("girish is a student of sunbeam");
		
		String[] s2 = s1.split(" ");
		int count = 0;
		
		for(String str : s2) {
			count++;
		}
		System.out.println(count);
	}

}
