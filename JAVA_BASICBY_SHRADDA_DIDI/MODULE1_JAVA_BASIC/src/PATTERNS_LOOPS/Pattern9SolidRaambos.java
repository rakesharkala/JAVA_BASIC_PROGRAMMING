package PATTERNS_LOOPS;

import java.util.Scanner;

public class Pattern9SolidRaambos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of Rammbos : ");

		int n = sc.nextInt();
		System.out.println("=========================");

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n - i; j++) {

				System.out.print(" ");
			}
			for (int j = 1; j <= n; j++) {

				System.out.print("*");

			}
			System.out.println();
		}
		System.out.println("=========================");

	}

}
