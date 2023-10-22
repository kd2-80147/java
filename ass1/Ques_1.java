import java.util.Scanner;

public class Ques_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();
		System.out.println("Given Number: " + num);
		
		System.out.println("In Binary Decimal = "+ Integer.toBinaryString(num));
		System.out.println("In Octal Decimal = "+ Integer.toOctalString(num));
		System.out.println("In Hex Decimal = "+ Integer.toHexString(num));
		sc.close();
	}

}
