package BASIC_PROGRAMS_CHAP_2;

import java.util.Scanner;

public class Q3 {
//	c.	Write a program to find the factorial value of any number entered through the 
//	keyboard (Use both forward / backward Iteration).
	
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
	int  fact=1;
	int i=1;
	while(i<=n) {
		fact=fact*i;
		
		i++;
	}System.out.println(fact);
	
	
}
}
