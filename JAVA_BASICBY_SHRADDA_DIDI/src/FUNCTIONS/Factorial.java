package FUNCTIONS;

import java.util.Scanner;

public class Factorial {
	
	public static int fact(int a) {
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
			
		}
		return fact;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" the value of  n : ");
		
		int n=sc.nextInt();
		int sum=fact(n);
		System.out.println(" the factorial is : "+sum);
		
		
		
		
	}

}
