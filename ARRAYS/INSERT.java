package ARRAYS;

import java.util.Scanner;

public class INSERT 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size=10,pos=4,ele=8;
		
		int a[]=new int [size+1];
		
		for(int i=0;i<size ;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(int i=a.length-1;i>=pos;i--)
	        a[i]=a[i-1];
			a[pos]=ele;
			
			for ( int xi : a) {
				System.out.print(xi+"  ");
				
			}
		
	}
	

}
