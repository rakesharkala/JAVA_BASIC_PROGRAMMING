package FUNCTIONS;

import java.util.Scanner;

public class multiply2No {
	
	public static int multiply(int a ,int b) {
		
		
		return a*b;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter a and b values : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int sum=multiply(a,b);
		System.out.println("the sum of the multiplication : "+sum);
		
		
		
		

	}

}
