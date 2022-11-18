package BASIC_PROGRAMS_CHAP_1;

import java.util.Scanner;

public class F_1 {
//	f.	Murali’s basic salary is input through the keyboard. 
//	His dearness allowance is 40% of basic salary, and house rent allowance is 20% of basic salary. 
//	Write a program to calculate his gross salary.
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int bs=sc.nextInt();
		double da=40/100.0*bs;
		double hr=20/100.0*bs;   //formula to find percentage per/100*total;
		
		double gs=bs-da-hr;
		System.out.println("gross salary : "+gs);
		
		
		
	}

	
}
