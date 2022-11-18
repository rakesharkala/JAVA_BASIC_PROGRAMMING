package PATTERNS_LOOPS;

import java.util.Scanner;

public class Pattern8_0_1Traiangle {

	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter the length of the pattern : ");
    int n=sc.nextInt();
    
    for(int i=1;i<=n;i++) {
    	
    	
    	for(int j=1;j<=i;j++) {
    		
    		if(j%2==0) {
    			System.out.print("1 ");
    		}else {
    			System.out.print("0 ");
    		}
    	}
    	System.out.println();
    }
	}
}
