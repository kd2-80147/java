package com.sunbeam;

import java.sql.SQLException;
//import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainQues1 {

	static int menu(Scanner scan) {
		int choice;

		System.out.println("*************************************");
		System.out.println("0. EXIT");
		System.out.println("1. ADD CANDIDATE");
		System.out.println("2 SHOW ALL CANDIDATES");
		System.out.println("3. DISPLAY CANDIDATE BY GIVEN PARTY");
		System.out.println("4. DELETE CANDIDATE BY ID");
		System.out.println("5. INCREMENT VOTE BY ID");
		System.out.println("6. UPDATE CANDIDATE INFO");
		System.out.println("7. GET PARTY VOTES");
		System.out.println("*************************************");
		System.out.print("Enter Your Choice : ");
		choice = scan.nextInt();
		System.out.println("*************************************");

		return choice;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice;
		List<Candidate> list;

		while ((choice = menu(scan)) != 0) {
			switch (choice) {
			case 1: // add a candidate
				Candidate c = new Candidate();
				c.accept(scan);
				try(CandidateDao candb = new CandidateDao()){
					int cnt = candb.saveGivenCandidate(c);
					System.out.println("Rows added : " + cnt);
				} catch(SQLException e) {
					e.printStackTrace();
				}

				break;
			case 2://Display all candidates
				try(CandidateDao candb = new CandidateDao()){
					list = candb.findAll();
					list.forEach(ele -> System.out.println(ele));
				} catch(SQLException e) {
					e.printStackTrace();
				}
				
				break;
			case 3: //Display by a given party
				System.out.print("Enter Party of candidates to search : ");
				String party = scan.next();
				try(CandidateDao candb = new CandidateDao()){
					list = candb.findByGivenParty(party);
					list.forEach(ele -> System.out.println(ele));
				} catch(SQLException e) {
					e.printStackTrace();
				}
				break;
			case 4: //Delete by a given Id
				System.out.print("Enter Candidate Id to be deleted : ");
				int id = scan.nextInt();
				try(CandidateDao candb = new CandidateDao()){
					int cnt = candb.deleteById(id);
					System.out.println("Rows Deleted : " + cnt);
				} catch(SQLException e) {
					e.printStackTrace();
				}
				break;
			case 5: //Increment vote by Id
				System.out.print("Enter Candidate Id to Increment : ");
				id = scan.nextInt();
				try(CandidateDao candb = new CandidateDao()){
					int cnt = candb.incrementByVote(id);
					System.out.println("Rows Updated : " + cnt);
				} catch(SQLException e) {
					e.printStackTrace();
				}
				break;
			case 6:
				Candidate c1 = new Candidate();
				c1.accept(scan);
				try(CandidateDao candb = new CandidateDao()){
					int cnt = candb.update(c1);
					System.out.println("Rows Updated : " + cnt);
				} catch(SQLException e) {
					e.printStackTrace();
				}
				break;
			case 7:
				List<PartyWiseVotes> list1;
				try(CandidateDao candb = new CandidateDao()){
					list1 = candb.partyWiseVotes();
					list1.forEach(ele -> System.out.println(ele));
				} catch(SQLException e) {
					e.printStackTrace();
				}
				break;
			default:
				System.out.println("Invalid Choice..... Try Again!!");
				break;
			}
		}
		System.out.println("Thank you for using the application!!!");
	
	}

}
