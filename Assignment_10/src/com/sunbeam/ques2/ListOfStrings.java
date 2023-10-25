package com.sunbeam.ques2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListOfStrings {

	public static void main(String[] args) {
		
		class Compare implements Comparator<String>{
			@Override
			public int compare(String s1, String s2) {
				int diff = s1.length() - s2.length();
				return diff;
			}
		}
		List<String> list = new ArrayList<>();
		
		Collections.addAll(list, "Shikhar", "Bhanu", "Abhey", "Ashish","PrajwalKognole");
		
		Compare compare = new Compare();
		
		String ele = Collections.max(list,compare);
		
		System.out.println(ele);

	}

}
