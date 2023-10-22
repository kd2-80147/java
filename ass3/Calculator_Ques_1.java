package com.sunbeam;

public class Calculator_Ques_1 {
		int account_number;
		int balance;
		int charges;
		int credit_applied;
		int credit_limit;
		
		public Calculator_Ques_1() {

		}

		public Calculator_Ques_1(int account_number, int balance, int charges, int credit_applied, int credit_limit) {
			super();
			this.account_number = account_number;
			this.balance = balance;
			this.charges = charges;
			this.credit_applied = credit_applied;
			this.credit_limit = credit_limit;
		}

		public int getAccount_number() {
			return account_number;
		}

		public int getBalance() {
			return balance;
		}

		public int getCharges() {
			return charges;
		}

		public int getCredit_applied() {
			return credit_applied;
		}

		public int getCredit_limit() {
			return credit_limit;
		}
}
