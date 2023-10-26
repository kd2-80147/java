package com.sunbeam;

public class PartyWiseVotes {
	private String party;
	private int votes;
	
	public PartyWiseVotes() {
	}

	public PartyWiseVotes(String party, int votes) {
		this.party = party;
		this.votes = votes;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	@Override
	public String toString() {
		return "PartyWiseVotes [party=" + party + ", votes=" + votes + "]";
	}
	
	
}
