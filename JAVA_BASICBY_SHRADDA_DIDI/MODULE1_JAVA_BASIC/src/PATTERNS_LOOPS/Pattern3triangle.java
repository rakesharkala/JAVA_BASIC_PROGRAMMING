package PATTERNS_LOOPS;

import java.util.Scanner;

public class Pattern3triangle {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println( "enter the n value to print pattern : ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
