package com.app.fruits;

public class Apple extends Fruit{
	public Apple() {
		
	}
	@Override
	public String taste() {
		return "Sweet and sour";
	}
	@Override
	public void acceptData() {
		super.acceptData();
	}
//	@Override
//	public String toString() {
//		return "s";
//	}
}
