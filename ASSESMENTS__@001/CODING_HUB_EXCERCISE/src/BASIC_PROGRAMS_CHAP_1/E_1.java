package BASIC_PROGRAMS_CHAP_1;

import java.util.Scanner;

public class E_1 {
	//e.	Two numbers are input through the keyboard into two locations C and D.
	//Write a program to interchange the contents of C and D (Using E Location & without
	//Using E Location)
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		int d=sc.nextInt();
		
		int temp=c;
		c=d;
		d=temp;
		System.out.println("the value of c :  "+c);
		System.out.println("the value of d :  "+d);
	}
}
