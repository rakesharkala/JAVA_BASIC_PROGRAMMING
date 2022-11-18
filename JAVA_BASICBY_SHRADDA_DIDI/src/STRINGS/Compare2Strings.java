package STRINGS;

import java.util.Scanner;

public class Compare2Strings {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two string >>> ");
		String s=sc.next();
		String s2=sc.next();
		
		if(s.equals(s2)){
			System.out.println("both strings are equal ... ");
			
		}else {
			System.out.println("both string are not equal ... ");
		}
		
		
		
	}

}
