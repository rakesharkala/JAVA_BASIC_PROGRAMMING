package STRINGS;

import java.util.Scanner;

public class NO_OF_WORDS_USING_LOGIC
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER A sTRING :");
		String x= sc.nextLine();
		int count=1;
		
		for(int i=0;i<x.length();i++)
		{
			if(x.charAt(i)==' ')
			{
				count++;
				
			}
			
		}
		System.out.println("THE WORDS IN A STRING : "+count);
		
		
		
	}

}
