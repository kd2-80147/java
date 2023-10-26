package com.sunbeam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class MainQues3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 4 Strings : ");
		try (FileWriter fwr = new FileWriter("file.txt")) {
			try (BufferedWriter bout = new BufferedWriter(fwr)) {
				for (int i = 0; i < 4; i++) {
					String line = scan.nextLine();
					bout.write(line + "\n");
					//bout.newLine();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		scan.close();
	}

}
