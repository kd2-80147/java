package com.sunbeam;

@FunctionalInterface
public interface Emp {	
	double getSal(); 
	default double calcIncentives() {
	
		return 0.0;
	}
	static double calcTotalIncome(Emp arr[]) {
		double totalSalaryArray = 0;
		for(Emp ele : arr) {
			totalSalaryArray += ele.getSal() + ele.calcIncentives();
		}
		
		return totalSalaryArray;
	}
}
