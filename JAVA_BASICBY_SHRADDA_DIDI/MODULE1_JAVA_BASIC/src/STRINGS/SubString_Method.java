package STRINGS;

import java.util.Scanner;

public class SubString_Method {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ur full name : ");
		String s=sc.nextLine();
		
		System.out.println("Befor apply substring on name :   "+s);
		
		String s2=s.substring(7,13);
		
		System.out.println(s2);
		
		
		
	}

}
