package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class _2ND_LARGEST
{
	public static void main(String[] args) 
	{
		System.out.print("ENTER THE SIZE OF AN ARRAY :  ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
				
		int a[]=new int[n];
		System.out.println("ENTER THE ELE : ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	
		int high=Integer.MIN_VALUE;
		int shigh=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>high)
			{
				shigh=high;
			     high=a[i];    
			}
			if(a[i]<high&&a[i]>shigh)
			{
				shigh=a[i];
			}
		}
		System.out.println("SECOND HIGHEST : "+shigh);
	}

}
