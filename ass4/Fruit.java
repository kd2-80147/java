package com.app.fruits;

import java.util.Scanner;

public class Fruit {
	static Scanner sc = new Scanner(System.in);
	String color;
	double weight;
	String name;
	boolean isFresh;
	public Fruit() {
		
	}
	public Fruit(String color, double weight, String name, boolean isFresh) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
	public void acceptData() {
		System.out.print("Enter the color: ");
		this.color = sc.next();
		System.out.print("Enter the weight: ");
		this.weight = sc.nextDouble();
		System.out.print("Enter the name: ");
		this.name = sc.next();
		System.out.print("Is the friut fresh: ");
		isFresh = sc.nextBoolean();
	}
	public String getColor() {
		return color;
	}
	public double getWeight() {
		return weight;
	}
	public String getName() {
		return name;
	}
	public boolean isFresh() {
		return isFresh;
	}
	
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	@Override
	public String toString() {
		return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}
	public String taste() {
		return "No specific taste";
	}
}
