package STRINGS;

import java.util.Scanner;

public class AccesCharecters {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		
		String name="Rakesh Arkala";
		
		for(int i=0;i<=name.length()-1;i++) {
			char v=name.charAt(i);
			System.out.println(v);
		}
	}

}
