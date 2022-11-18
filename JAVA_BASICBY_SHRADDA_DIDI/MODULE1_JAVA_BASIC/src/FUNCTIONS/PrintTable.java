package FUNCTIONS;

import java.util.Scanner;

public class PrintTable {

	public static void table(int a) {
		int val;

		for (int i = 1; i <= 10; i++) {
			val = i * a;
			System.out.println(a + "*" + i + "=" + val);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table no : ");
		int n = sc.nextInt();
		int m=sc.nextInt();
		table(n);
		table(m);
	}
}
