package BASIC_PROGRAMS_CHAP_4;

import java.util.Scanner;

public class Q1 {
//	(Use Scanner & classes, Methods & Objects)
//	a.	Write a program to find the factorial value of any number entered through the keyboard.

		public int fact(int n) {
			
			int fact1=1;
			for(int i=1;i<=n;i++) {  //fact
				fact1=fact1*i;
			}
			return fact1;
			
		}
		

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Q1 obj=new Q1();
		int s=obj.fact(n);
		System.out.println(s);
		
		
	}

}
