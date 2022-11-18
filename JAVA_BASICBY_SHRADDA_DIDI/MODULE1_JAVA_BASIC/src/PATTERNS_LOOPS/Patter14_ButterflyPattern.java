package PATTERNS_LOOPS;

import java.util.Scanner;

public class Patter14_ButterflyPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// UPPER HALF

		for (int i = 1; i <= n; i++) {
			// FIRST HALF
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// SPACES
			int sum = 2 * (n - i);
			for (int j = 1; j <= sum; j++) {
				System.out.print(" ");
			}
			// 2nd HALF
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// LOWER HALF
		for (int i = n; i >= 1; i--) {
			// FIRST HALF
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// SPACES
			int sum = 2 * (n - i);
			for (int j = 1; j <= sum; j++) {
				System.out.print(" ");
			}
			// 2nd HALF
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
