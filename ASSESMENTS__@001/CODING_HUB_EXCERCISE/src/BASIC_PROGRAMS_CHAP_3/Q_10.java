package BASIC_PROGRAMS_CHAP_3;

public class Q_10 {
//	k.	Write a program to reverse a number.
	public static void main(String[] args) {

		int rem, rev = 0, n = 325;
		while (n > 0) {
			rem = n%10;
			rev = rev * 10 + rem;
			n = n / 10;

		}
		System.out.println(rev);
	}
}
