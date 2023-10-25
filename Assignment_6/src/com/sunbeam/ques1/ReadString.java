package com.sunbeam.ques1;

public class ReadString {
	String line;

	public void setLine(String line) {
		
		if(line.length() > 80) {
			throw new ExceptionLineTooLong("String too long!!"); 
		}
		
		this.line = line;
	}

	@Override
	public String toString() {
		return "String = " + line + ", " + "String length = " + line.length();
	}
	
	

}
