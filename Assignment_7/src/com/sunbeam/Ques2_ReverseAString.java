package com.sunbeam;

public class Ques2_ReverseAString {
	public static void main(String[] args) {
		String s1 = "Shikhar";
		
		for(int i = s1.length() - 1 ; i >= 0 ; i--) {
			char ch = s1.charAt(i);
			System.out.print(ch);
		}
	}
}
