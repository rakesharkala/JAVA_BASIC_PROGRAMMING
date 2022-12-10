package STRINGS_CHAPTER_2;

import java.util.Scanner;

//25.	Write a Java program to count the repeated words in a String

public class Q4
{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  String s=sc.nextLine();
	  String a[]=s.split(" ");
	  
	  for(int i=0;i<a.length;i++)
	  {
		  int count=0;
		  for(int j=i+1;j<a.length;j++)
		  {
			  if(a[i]==a[j])
			  {
				  count++;
			  }
		  }
		 
		  
	  }
	 
	
}
}
