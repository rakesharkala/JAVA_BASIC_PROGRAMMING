package ARRAYS;

import java.util.Iterator;
import java.util.Scanner;

public class ADDING_ADJ_ELE 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER SIZE OF AN ARRAY : ");
		int n=sc.nextInt();
		
		System.out.println("ENTER THE ARR ELE : ");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
		   a[i]=sc.nextInt();
		}
		
		System.out.println("BEFORE SWAPPING ");
		for (int i : a)
		{
		   System.out.print(i+ " ");	
		}
		System.out.println();
		
		int b[]=new int[a.length];
		for (int i = 0; i < a.length; i++)
		{
			if(i==0)
			{
				b[i]=a[i]+a[i+1];
				
			}
			else if(i==a.length-1)
			{
			   b[i]=a[i]+a[i-1];
			}
			else
			{
				b[i]=a[i-1]+a[i+1];
			}
		}
		System.out.println("AFTER ADDING :");
		for (int i : b)
		{
			System.out.print(i+ " ");
			
		}
	}

}
