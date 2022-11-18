package BASIC_PROGRAMS_CHAP_4;

import java.util.Scanner;

class fact{
	public int fact1(int n) {
		int i;
		for( i=0;i<n;i++)
		{
			 if(n%i==0) {
				
			
			 }
		}
		return i;
		
		
	}
}
public class Q2 {
//	b.	Write a program to find the factors of a number.
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt();
		
		fact obj=new fact();
		int x=obj.fact1(n);
		System.out.println(n);
		

}
}
