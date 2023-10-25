package com.sunbeam.ques3;

import java.util.Scanner;

public class Cricketer extends Player implements Batter, Baller {
	private int runs;
    private double average;
    private double strikeRate;
    private int wickets;
    private double economy;

	void accept() {
		super.accept();
		System.out.print("Enter the runs : ");
		this.runs = new Scanner(System.in).nextInt();
	}

	public Cricketer() {
		super();
	}

	@Override
	public int getWickets() {
		return 0;
	}

	@Override
	public double getEconomy() {
		return 0;
	}

	@Override
	public int getRuns() {
		return 0;
	}

	@Override
	public double getAverage() {
		return 0;
	}

	@Override
	public double getStrikeRate() {
		return 0;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
