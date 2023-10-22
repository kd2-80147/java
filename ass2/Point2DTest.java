package tester;

import java.util.Scanner;

import com.app.geometry.Point2D_Ques_4;

public class Point2DTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Co-ordinates for point 1: ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		Point2D_Ques_4 point = new Point2D_Ques_4(x,y);
		
		System.out.println("Enter the Co-ordinates for point 2: ");
		x = scan.nextInt();
		y = scan.nextInt();
		
		Point2D_Ques_4 point1 = new Point2D_Ques_4(x,y);
		
		if(point.isEqual(point1)) {
			System.out.println( point.getDetails());
			System.out.println();
			System.out.println( point1.getDetails());
		} else {
			point.addPoint(point1);
		}
		scan.close();	
	}
}
