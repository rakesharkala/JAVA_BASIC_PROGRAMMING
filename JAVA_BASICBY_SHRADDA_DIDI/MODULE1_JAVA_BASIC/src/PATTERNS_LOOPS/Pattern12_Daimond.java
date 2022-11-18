package PATTERNS_LOOPS;

import java.util.Scanner;

public class Pattern12_Daimond {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// upper half
		for (int i = 1; i <= n; i++) {

			// Spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// Pattern
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int k = 2; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// lower half

		for (int i = n; i >= 1; i--) {

			// Spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// Pattern
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int k = 2; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
