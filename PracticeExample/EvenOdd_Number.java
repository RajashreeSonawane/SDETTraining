package PracticeExample;

import java.util.Scanner;

public class EvenOdd_Number {
	public static void main(String[] args) {
		for (int n = 1; n <= 30; n++) {
			System.out.println("Enter the number");
			Scanner sc = new Scanner(System.in);
			int n1 = sc.nextInt();
			if ((n1 % 2 != 0) && (n1 >= 1 && n1 <= 30)) {
				System.out.println(n1 + "Weird");
			} else if ((n1 % 2 == 0) && (n1 >= 1 && n1 <= 30)) {
				System.out.println(n1 + "Not Weird");
			} else {
				System.out.println("Number is not accepted");
			}
		}
	}
}