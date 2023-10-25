package com.sunbeam.ques1;

public class Box <T extends Person> {
	private T obj;
	
	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public double getTotalSalary() {
		return obj.totalSalary();
	}
}
