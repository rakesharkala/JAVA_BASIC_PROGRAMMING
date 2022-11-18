package BASIC_PROGRAMS_CHAP_4;

import java.util.Scanner;

class arms {
	public String armcheck(int n) {
		String s;

		int rem, rev = 0, temp;
		temp = n;

		while (n > 0) {
			rem = n % 10;
			rev = rev + rem * rem * rem;
			n = n / 10;
		}
		if (temp == rev) {
			s = "armstrong ";

		} else {
			s = "not armstrong ";
		}

		return s;
	}
}

public class Q5 {
//	e.	Write a program to find whether a number is Armstrong or not
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		arms obj = new arms();
		String s = obj.armcheck(n);
		System.out.print(s);
	}

}
