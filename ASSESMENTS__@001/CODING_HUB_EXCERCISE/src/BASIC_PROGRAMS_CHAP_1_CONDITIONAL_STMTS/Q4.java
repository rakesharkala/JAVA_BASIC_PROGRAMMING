package BASIC_PROGRAMS_CHAP_1_CONDITIONAL_STMTS;

import java.util.Scanner;

public class Q4 {
	//4.	Any character is entered through the keyboard, 
	//write a program to determine whether the character entered is a capital letter,
	//a small case letter, a digit or a special symbol.(use ascii values)
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	 char ch=sc.next().charAt(0);
		if(ch>=65&&ch<=90) {
			
			System.out.println("capital letter ");
			
		}
		else if(ch>=97&&ch<=122) {
			System.out.println("small letter  ");
		}
		else if(ch>=48&&ch<=57) {
			System.out.println("digits");
		}
		else {
			System.out.println("symbol");
		}
	
	}

	
}
