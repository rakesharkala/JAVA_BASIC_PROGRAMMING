package FUNCTIONS;

import java.util.Scanner;

public class Add {
	
	public static void Addition(int a,int b) {
		int sum=a+b;
		System.out.println("the sum of those two no s :"+sum);
		return;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b values : ");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		Addition(a,b);
		
	}

}

// function  is peice of code that perform some task *** the function no need of object to call where
//else the methods need object to call