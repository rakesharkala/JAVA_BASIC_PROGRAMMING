package STRINGS;

import java.util.Scanner;

public class BaseInput {
	
	public static void main(String[] args) {
		
		Scanner sc=new  Scanner(System.in);
		
		//String s="rakehsh arkala";
		//System.out.println(s);
		
		 int n=sc.nextInt();
		 
		 String s[]=new String[n];
		 
		 for(int i=0;i<=n-1;i++) {
			 s[i]=sc.next();
			 
		 }
		 
		 for(int i=0;i<=s.length-1;i++) {
			 System.out.print(s[i]+" ");
		 }
	
		 
	}

}
