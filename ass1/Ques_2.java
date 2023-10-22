import java.util.Scanner;

public class Ques_2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double num1;
		double num2;
		
		System.out.println("Enter the Numbers: ");
		
		if(sc.hasNextDouble() && !sc.hasNextInt()) {
			
			num1 = sc.nextDouble();
			
			if(sc.hasNextDouble() && !sc.hasNextInt()) {
				
				num2 = sc.nextDouble();
				
				double avg = (num1 + num2) / 2;
				
				System.out.println("The average is: " + avg);
				
			} else {
				
				System.out.println("Please enter Decimal value...");
			}
		} else {
			System.out.println("Please enter Decimal value..");
		}
		
		sc.close();
	}
}
