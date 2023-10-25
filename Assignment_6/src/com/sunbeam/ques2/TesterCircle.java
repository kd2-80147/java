package com.sunbeam.ques2;

public class TesterCircle {

	public static void main(String[] args) {
		Circle circle = new Circle();
		
		try {
		circle.accept();
		System.out.println(circle);
		}
		catch(NegativeDiameterException error) {
			System.err.println(error);
		}
	}

}
