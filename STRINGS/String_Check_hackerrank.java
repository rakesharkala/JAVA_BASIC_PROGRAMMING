package STRINGS;

import java.util.Scanner;

public class String_Check_hackerrank 
{

	    public static void main(String[] args)
	    {
	      Scanner sc=new Scanner(System.in);
	        
	        int n=sc.nextInt();
	        String[] name=new String[n];
	        for(int j=0;j<n;j++)
	        {	
	         name[j]=sc.next();
	        }
	        for(int i=0;i<name.length;i++)
	        {
	            if(name[i].length()<8)
	            {
	                System.out.println("Invalid");
	            }
	            else if(name[i].charAt(0)>='1'||name[i].charAt(0)<='9')
	            {
	                System.out.println("Invalid");
	            }
	            else if(name[i].charAt(i)=='?')
	            {
	                System.out.println("Invalid");
	            }
	            else if (name[i].charAt(0)>'A'||name[i].charAt(0)<='Z'){
	                System.out.println("Valid");
	            }
	           
	        }
	     
	    }
	}
