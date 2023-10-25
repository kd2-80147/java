package com.sunbeam.ques3;

public class Players {
	public static int batterTotalRuns(Player[] arr) {
		int runs = 0;
		for (Player p : arr) {
			if (p instanceof Batter) {
				Batter b = (Batter) p;
				runs = runs + b.getRuns();

			}
		}
		return runs;
	}

	public static int bowlerTotalWickets(Player[] arr) {
		int wickets = 0;
		for(Player p : arr) {
			if(p instanceof Baller) {
				Baller baller = (Baller) p;
				wickets += baller.getWickets();
			}
		}
		return wickets;
	}

	public static int countBatters(Player[] arr) {
		int count = 0;
		for(Player p : arr) {
			if(p instanceof Batter)
				count++;
		}
		return count;
	}

	public static int countBowlers(Player[] arr) {
		int count = 0;
		for(Player p : arr) {
			if(p instanceof Baller)
				count++;
		}
		return count;
	}

	public static Player maxRunBatter(Player[] arr) {
		int max_index = -1, max = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] instanceof Batter) {
				Batter batter = (Batter) arr[i];
				if(batter.getRuns() > max)
					max = batter.getRuns();
					max_index = i;
			}
		}
		return arr[max_index];
	}

	public static Player maxWicketBowler(Player[] arr) {
		int max_index = -1, max = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] instanceof Baller) {
				Baller baller = (Baller) arr[i];
				if(baller.getWickets() > max)
					max = baller.getWickets();
					max_index = i;
			}
		}
		return arr[max_index];
	}
}
