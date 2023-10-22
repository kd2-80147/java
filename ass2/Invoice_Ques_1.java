package com.sunbeam.assignment;

public class Invoice_Ques_1{
	String part_number;
	String part_description;
	int qty;
	double price;
	public Invoice_Ques_1(String part_number, String part_description, int qty, double price) {
		super();
		this.part_number = part_number;
		this.part_description = part_description;
		this.qty = qty;
		this.price = price;
	}
	public String getPart_number() {
		return part_number;
	}
	public void setPart_number(String part_number) {
		this.part_number = part_number;
	}
	public String getPart_description() {
		return part_description;
	}
	public void setPart_description(String part_description) {
		this.part_description = part_description;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double calculateInvoiceAmount() {
		double amt;
		if(price < 0)
			price = 0.0;
		if(qty < 0)
			qty = 0;
		amt = price*qty;
		
		return amt;
	}
	
};


