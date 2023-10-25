package com.sunbeam.ques3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Player[] team = new Player[11];
		
		for(int i=0; i<team.length; i++) {
			System.out.print("Enter 1 for batter and 2 for bowler: ");
			int choice = scan.nextInt();
			if(choice == 1) {
				
				team[i] = new Cricketer();
			}
			else
				team[i] = new Cricketer();
			team[i].accept();
		}
		
		for(Player p:team)
			System.out.println(p.toString());
		
		int totalRuns = Players.batterTotalRuns(team);
		
		System.out.println("Total runs of all batters: " + totalRuns);

	}

}
