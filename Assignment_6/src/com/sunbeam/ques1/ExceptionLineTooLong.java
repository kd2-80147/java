package com.sunbeam.ques1;

public class ExceptionLineTooLong extends RuntimeException{
	String fieldValue1;	
	
	public ExceptionLineTooLong() {
			
	}
	public ExceptionLineTooLong(String message) {
		this.fieldValue1 = message;
	}
	@Override
	public String toString() {
		return "ExceptionLineTooLong [ " + fieldValue1 +" ]";
	}
	
	
}
