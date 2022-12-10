package STRINGS;

import java.util.Scanner;

public class STRING_PALINDROME 
{
	public static void main(String[] args) 
	{
	     Scanner sc=new Scanner(System.in);
	     
	     System.out.print("ENTER A STRING TO CHECK WHETHER ITS PALINDROME OR NOT : ");
	     String s=sc.next();
	     String s2="";
	     
	     for(int i=s.length()-1;i>=0;i--)
	     {
	    	 s2=s2+(s.charAt(i));
	     }
	     if(s.equals(s2))
	     {
	    	 	System.out.println(s+" IS PALINDROME ");
	     }
	     else {
	    	 System.out.println(s+" NOT PALINDROME ");
	     }

		
		
	}
}