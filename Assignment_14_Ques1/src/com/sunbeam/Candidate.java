package com.sunbeam;

import java.util.Scanner;

public class Candidate {
	private int id;
	private String name;
	private String party;
	private int votes;
	
	public Candidate() {
	}

	public Candidate(int id, String name, String party, int votes) {
		this.id = id;
		this.name = name;
		this.party = party;
		this.votes = votes;
	}
	public void accept(Scanner scan) {
		System.out.print("Enter Id : ");
		this.id = scan.nextInt();
		System.out.print("Enter Name : ");
		this.name = scan.next();
		System.out.print("Enter Party : ");
		this.party = scan.next();
		System.out.print("Enter Votes Given : ");
		this.votes = scan.nextInt();

	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "Candidate [id=" + id + ", name=" + name + ", party=" + party + ", votes=" + votes + "]";
	}
	
}
