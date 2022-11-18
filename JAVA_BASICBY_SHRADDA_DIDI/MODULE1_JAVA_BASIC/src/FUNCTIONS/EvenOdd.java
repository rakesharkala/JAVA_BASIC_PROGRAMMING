package FUNCTIONS;

import java.util.Scanner;

public class EvenOdd {

	public static void Evenodd(int a) {

		if (a % 2 == 0) {
			System.out.println("Even number !!  ");

		} else {
			System.out.println("Odd number !!  ");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the n value :  ");
		int n = sc.nextInt();

		Evenodd(n);
	}

}
