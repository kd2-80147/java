package tester;

import com.sunbeam.assignment.Invoice_Ques_1;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice_Ques_1 i = new Invoice_Ques_1("P102", "bolt", 12, 4.5);

		String s = i.getPart_number();
		System.out.println("The Part Number is = " + s);

		s = i.getPart_description();
		System.out.println("The Part Description is = " + s);

		int qty = i.getQty();
		System.out.println("The qty bought is: " + qty);

		double price = i.getPrice();
		System.out.println("The price for the part bought is: " + price);

		double amt = i.calculateInvoiceAmount();
		System.out.println("The Amount of the parts bought is: " + amt);

	}

}
