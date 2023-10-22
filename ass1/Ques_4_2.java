public class Ques_4_2 {
	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {

			if (i % 2 == 1) {
				for (int j = 1 ; j <= ((9 - i) / 2) ; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		for (int i = 7; i >= 1; i--) {

			if (i % 2 == 1) {
				for (int j = ((7 - i) / 2) + 1 ; j >= 1 ; j--) {
					System.out.print(" ");
				}
				for (int j = i; j >= 1; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
