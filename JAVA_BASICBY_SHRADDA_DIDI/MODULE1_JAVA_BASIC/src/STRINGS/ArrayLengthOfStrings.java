package STRINGS;

import java.util.Scanner;

public class ArrayLengthOfStrings {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		String[] s=new String[n];
		int totl=0;
		
		for(int i=0;i<=s.length-1;i++) {
			s[i]=sc.next();
			totl+=s[i].length();
			
		}
		System.out.println(totl);
		
	}
}
