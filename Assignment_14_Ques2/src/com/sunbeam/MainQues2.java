package com.sunbeam;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class MainQues2 {

	static int menu(Scanner scan) {
		int choice;

		System.out.println("*************************************");
		System.out.println("0. EXIT");
		System.out.println("1. ADD USER");
		System.out.println("2. SHOW ALL USERS");
		System.out.println("3. DELETE USER BY ID");
		System.out.println("4. CHANGER USER STATUS");
		System.out.println("5. UPDATE USER INFO");
		System.out.println("*************************************");
		System.out.print("Enter Your Choice : ");
		choice = scan.nextInt();
		System.out.println("*************************************");

		return choice;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice;
		List<Users> list;

		while ((choice = menu(scan)) != 0) {
			switch (choice) {
			case 1: // add a user
				Users user = new Users();
				user.accept(scan);
				try (UsersDao userdb = new UsersDao()) {
					int cnt = userdb.addUser(user);
					System.out.println("Rows added : " + cnt);
				} catch (SQLException e) {
					e.printStackTrace();
				}

				break;
			case 2:// Display all users
				try (UsersDao userdb = new UsersDao()) {
					list = userdb.findAll();
					list.forEach(ele -> System.out.println(ele));
				} catch (SQLException e) {
					e.printStackTrace();
				}

				break;
			case 3: // Delete by a given Id
				System.out.print("Enter User Id to be deleted : ");
				int id = scan.nextInt();
				try (UsersDao userdb = new UsersDao()) {
					int cnt = userdb.deleteById(id);
					System.out.println("Rows Deleted : " + cnt);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 4: // Change user Status
				System.out.print("Enter User Id to Change Status : ");
				id = scan.nextInt();
				try (UsersDao userdb = new UsersDao()) {
					int cnt = userdb.changeStatusById(id);
					System.out.println("Rows Updated : " + cnt);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 5://Update user Info
				Users user1 = new Users();
				user1.accept(scan);
				try (UsersDao userdb = new UsersDao()) {
					int cnt = userdb.updateUser(user1);
					System.out.println("Rows Updated : " + cnt);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			default: 
				System.out.println("Invalid Choice.... Try Again!!");
				break;
			}
		}
		System.out.println("Thank you for using the application!!!");
	}

}
