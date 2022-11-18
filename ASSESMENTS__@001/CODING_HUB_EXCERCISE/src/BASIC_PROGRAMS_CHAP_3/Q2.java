package BASIC_PROGRAMS_CHAP_3;

import java.util.Scanner;

public class Q2 {
//	b.	Write a program to find the sum of first ‘n’ natural numbers 
//	(value of ‘n’ entered through the keyboard Use both forward / backward Iteration).
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	
	int sum=0;               //int i=0
	while(n>0) { //backward  //while i<n   //sum+=i;
		sum+=n;              //i++
		n--;
	}
	System.out.println(sum);
}
}
