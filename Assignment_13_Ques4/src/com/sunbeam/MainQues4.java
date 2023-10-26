package com.sunbeam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class MainQues4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 4 Strings : ");
		try (FileWriter fwr = new FileWriter("file.txt")) {
			try (BufferedWriter bout = new BufferedWriter(fwr)) {
				for (int j = 0; j < 4; j++) {
					String line = scan.nextLine();
					bout.write(line + "\n");
					//bout.newLine();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String str = "";
		try (FileReader fir = new FileReader("file.txt")) {
			try (BufferedReader br = new BufferedReader(fir)) {
				while ((str = br.readLine())!= null) 
					System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		scan.close();
	}

}
