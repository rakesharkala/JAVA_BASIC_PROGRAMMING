package BASIC_PROGRAMS_CHAP_4;

import java.util.Scanner;

class reve {
	public int revno(int n) {
		int rev = 0, rem;
		while (n > 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;

		}

		return rev;
	}
}

public class Q4 {
//	d.	Write a program to reverse a number.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		reve obj = new reve();

		System.out.print("enter no :  ");
		int n = sc.nextInt();

		int r = obj.revno(n);
		System.out.print("The reversed no is : " + r);
	}

}
