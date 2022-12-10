package STRINGS;

import java.util.Scanner;

public class COUNT_DIFF_VARIABLES 
{
   public static void main(String[] args) 
   {
	   Scanner sc=new Scanner (System.in);
	   
	   System.out.print("ENTER A STRING TO COUNT : ");
	   String s=sc.next();
	   int c=0,sm=0,n=0,sy=0;
	   for(int i=0;i<s.length();i++)
	   {
		   if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
		       c++;
		   
		   else if(s.charAt(i)>='a'&&s.charAt(i)<='z')
			   sm++;
		   
		   else if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			   n++;
		   
		   else sy++;
	   } 
	   System.out.println("CAPITALS : "+c+"\nSMALL : "+sm+"\nNUMBERS : "+n+"\nSYMBOLS : "+sy);
	
}

}
