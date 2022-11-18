package BASIC_PROGRAMS_CHAP_4;

import java.util.Scanner;

class fib{
	public int fibcheck(int n) {
		
		int a=1,b=2,c;
		
		
	System.out.print(a+" "+b+" ");
		c=a+b;
		int temp = c;
		c=b;
		b=temp;
		System.out.print(temp+" "+c+" ");

		return c;
}}

public  class Q3 {
//	c.	Write a program to print the Fibonacci series 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no :  ");
		int n=sc.nextInt();
		fib obj=new fib();
		int s=obj.fibcheck(10);
		
		System.out.println();
		


}
}