package STRINGS_CHAPTER_1;
//20.	Write a Java Program to delete duplicate characters in a String

import java.util.Scanner;

public class QN20_DEI_DUBLICATES 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		char x[]=s.toCharArray();
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]==x[j])
				{
					x[i]='_';
				}
			}
		}
		for(int i=0;i<x.length;i++)
		{
			if(x[i]!='_')
			{
				System.out.print(x[i]);
			}
			
		}
		
	}

}
