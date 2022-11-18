package BASIC_PROGRAMS_CHAP_3;

import java.util.Scanner;

public class Q3 {
//	e.	Write a program to print the multiplication table of the number 
//	entered by the user. The table should get displayed in the following form.
//	29 * 2 = 58
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int i=1;
		while (i<=10) {
			System.out.println(n+" x "+ i +" = "+ n*i );
			i++;
		}
	}

}
