package STRINGS_CHAPTER_1;

import java.util.Arrays;

//13.	Write a java program to sort a string both in Ascending and Descending (use both charAt() & toCharArray())

public class QN13_SORTING_2METHODS
{
	public static void main(String[] args)
	{
		String str="rakesh";
		char a[]=str.toCharArray();
		
		Arrays.sort(a);
		System.out.println(a);
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
		
//		
//		String s=" ";
		
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i+1;j<a.length;i++)
//			{
//				if(a[i]>a[j])
//				{
//					char t=a[i];
//					a[i]=a[j];
//					a[j]=t;
//				}
//			}
//			s=s+a[i];
//			
//		}
	//	System.out.println(s);
		
	}
	

}
