package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

	static int menu() {
		int choice;
		System.out.println("**************************************");
		System.out.println("0. EXIT");
		System.out.println("1. ADD MANGO");
		System.out.println("2. ADD ORANGE");
		System.out.println("3. ADD APPLE");
		System.out.println("4. DIPLAY NAME OF FRUITS");
		System.out.println("5. DISPLAY DETAILS OF ALL FRUITS");
		System.out.println("6. TASTES OF STALE FRUITS");
		System.out.println("7. MARK A FRUIT AS STALE");
		System.out.println("8. MARK ALL THE SOUR FRUITS AS STALE");
		System.out.println("**************************************");
		System.out.print("Enter your choice: ");
		choice = new Scanner(System.in).nextInt();
		System.out.println("**************************************");
		return choice;
	}

	public static void main(String[] args) {
		int n, choice;
		Scanner scan = new Scanner(System.in);
		System.out.print("How many Fruits you want to buy? ");
		n = scan.nextInt();
		Fruit basket[] = new Fruit[n];
		int count = 0;
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				basket[count] = new Mango();
				basket[count].acceptData();
				count++;
				break;
			case 2:
				basket[count] = new Orange();
				basket[count].acceptData();
				count++;
				break;
			case 3:
				basket[count] = new Mango();
				basket[count].acceptData();
				count++;
				break;
			case 4:
				for (Fruit fruit : basket) {
					System.out.println("Name of the Fruit = " + fruit.getName());
				}
				break;
			case 5:
				for(Fruit fruit : basket) {
					System.out.println("Details of fruit are: " + fruit.toString());
					System.out.println("Taste = " + fruit.taste());
					System.out.println();
				}
				break;
			case 6:
				for(Fruit fruit : basket) {
					if(fruit.isFresh() == false) {
						System.out.println("Stale fruit taste = " + fruit.taste());
					}
				}
				break;
			case 7:
				System.out.print("Enter the index of which fruit you are marking as stale: ");
				int index = scan.nextInt();
				basket[index].setFresh(false);
				break;
			case 8:
				for(Fruit fruit : basket) {
					if(fruit instanceof Orange) {
						fruit.setFresh(false);
					}
				}
				break;
			}
		}
		System.out.println("Thank you for using the application!!");
		scan.close();
	}
}
