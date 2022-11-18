package BASIC_PROGRAMS_CHAP_1_CONDITIONAL_STMTS;

import java.util.Scanner;

public class Q2 {
	//2.	Any integer is input through the keyboard.
	//Write a program to find out whether it is an odd number or even number
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		String s=(n%2==0)?"even":"odd"; //ternary operators
		
		System.out.println(s);
	}
}
