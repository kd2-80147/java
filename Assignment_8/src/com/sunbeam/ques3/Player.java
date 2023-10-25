package com.sunbeam.ques3;

import java.util.Scanner;

public abstract class Player {
	private int id;
	private String name;
	private int age; 
	private int matchesPlayed;

	void accept() {
		System.out.print("Enter Player Id : ");
		this.id = new Scanner(System.in).nextInt();
		System.out.print("Enter Player Name : ");
		this.name = new Scanner(System.in).next();
		System.out.print("Enter Player Age : ");
		this.age = new Scanner(System.in).nextInt();
		System.out.print("Enter Matches Played : ");
		this.matchesPlayed = new Scanner(System.in).nextInt();
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getMatchesPlayed() {
		return matchesPlayed;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", matchesPlayed=" + matchesPlayed + "]";
	}
	
}
