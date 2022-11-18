package BASIC_PROGRAMS_CHAP_1_CONDITIONAL_STMTS;

import java.util.Scanner;

public class Q1 {

//  1.	If cost price and selling price of an item is input through the keyboard,
//	write a program to determine whether the seller has made profit or incurred loss.
//	Also determine how much profit he made or loss he incurred.
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cp=sc.nextInt();
		int sp=sc.nextInt();
		
		int profit= sp-cp;
		int loss =cp-sp;
		
		if(sp>cp) {
		
		System.out.println("profit occured : "+ profit);
		}else {
		System.out.println("loss occured   : "+loss);
		
	}
	
}
}
