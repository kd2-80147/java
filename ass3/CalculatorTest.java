package tester;

import com.sunbeam.Calculator_Ques_1;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator_Ques_1 cal = new Calculator_Ques_1(101, 1000, 500, 150, 100);

		int newBalance = cal.getBalance() + cal.getCharges() - cal.getCredit_applied();

		System.out.println("The New balance is: " + newBalance);

		if (cal.getCredit_applied() > cal.getCredit_limit())
			System.out.println("Credit Limit Exceeded!!");

		System.out.println();
		Calculator_Ques_1 cal1 = new Calculator_Ques_1(102, 2000, 700, 150, 200);

		newBalance = cal1.getBalance() + cal1.getCharges() - cal1.getCredit_applied();

		System.out.println("The New balance is: " + newBalance);

		if (cal1.getCredit_applied() > cal1.getCredit_limit())
			System.out.println("Credit Limit Exceeded!!");

	}

}
