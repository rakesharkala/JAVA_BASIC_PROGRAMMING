package BASIC_PROGRAMS_CHAP_4;

import java.util.Scanner;

class pali{
	public String  check(int n) {
		int temp,rev=0,rem;
		temp=n;
		String s;
		
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(temp==rev) {
		   s="palindome";
		}
		else {
			s="not palindrome";
		}
		
		return s;
		
	}
}

public class Q6 {
//	f.	Write a program to find whether a number is palindrome or not.
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0;
		while(i<5) {
		System.out.println("enter the no to check whether no is prime or not :  ");
		int n=sc.nextInt();
		pali obj=new pali();
		String s=obj.check(n);
		System.out.println(s);
		i++;
	}
		System.out.println("ended");

}
}