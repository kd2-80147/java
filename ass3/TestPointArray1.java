package tester;

import java.util.Scanner;

import com.sunbeam.Point2D_Ques_2;

public class TestPointArray1 {

	static int menu() {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("*********************************************");
		System.out.println("1. DISPLAY DETAILS OF SPECIFIC POINT");
		System.out.println("2. DISPLAY X-Y COORDINATES OF ALL POINTS");
		System.out.println("3. CALCULATE THE DISTANCE");
		System.out.println("Press O to exit..");
		System.out.println("*********************************************");
		System.out.print("Enter your choice...");
		choice = sc.nextInt();
		System.out.println("*********************************************");
		return choice;
	}

	public static void main(String[] args) {
		System.out.println("How many points you want to plot...");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Point2D_Ques_2 point[] = new Point2D_Ques_2[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the points: ");
			int x = scan.nextInt();
			int y = scan.nextInt();
			point[i] = new Point2D_Ques_2(x, y);
		}
		int choice;
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				System.out.println("Enter the index of the point you want to see: ");
				int index = scan.nextInt();
				String details = point[index].getDetails();
				System.out.println(details);
				break;
			case 2:
				for (Point2D_Ques_2 arr : point) {
					String detail = arr.getDetails();
					System.out.println(detail);
				}
				break;
			case 3:
				System.out.println("Enter the Indexes of which Points you want to Calculate the Distance: ");
				int i = scan.nextInt();
				int j = scan.nextInt();
				point[i].addPoint(point[j]);
				break;
			}
		}
		System.out.println("Thank you for using the application..");
		scan.close();
	}

}
