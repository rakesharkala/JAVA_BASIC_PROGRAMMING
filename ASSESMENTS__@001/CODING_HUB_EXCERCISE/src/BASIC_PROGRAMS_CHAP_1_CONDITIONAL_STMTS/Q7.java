package BASIC_PROGRAMS_CHAP_1_CONDITIONAL_STMTS;

import java.util.Scanner;

public class Q7 {
//	7.	A library charges a fine for every book returned late. For first 5 days the fine
//	is 50 paise, for 6-10 days fine is one rupee and above 10 days fine is 5 rupees.
//	If you return the book after 30 days your membership will be cancelled. 
//	Write a program to accept the number of days the member is late to return the book 
//	and display the fine or the appropriate message.
	

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int days=sc.nextInt();
	double amount = 0;
	
	if(days<5) {
		amount=0.5;
		
	}
	else if(days>=6&&days<=10) {
		amount=1;
	}
	else if(days>10&&days<30) {
		amount=5;
		
	}
	else if(days>30) {
		System.out.println("ur membership cancelled !!");
		
	}
	else {
		System.out.println("ur not access");
	}
	System.out.println("the fine amount is :  "+amount+" rupeess");
	
}
	
	
}
