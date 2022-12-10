package STRINGS_CHAPTER_2;
//22.	Write a Java program to delete duplicate words in a String array

import java.util.Scanner;

public class Q2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		String a[]=s.split(" ");
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[i]="@";
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=="@")
			{
				System.out.print(a[i]+" ");
			}
		}
		
	}

}
