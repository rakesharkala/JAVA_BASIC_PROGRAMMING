package ARRAYS;

import java.util.Scanner;

public class ARRAY_RIGHT_ROTATE 
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("==========>  THIS IS RIGHT ROTATE <==========\n\n");
		System.out.print("ENTER SIZE OF AN ARRAY :  ");
		int n=sc.nextInt();
		int a[]=new int [n];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("ENTER NO OF ROTATIONS  :  ");
		int r=sc.nextInt();
		System.out.println();
		
		System.out.println("BEFORE ROTATE  :");
		for (int i : a) {
			System.out.print(i+"  ");
		}
		
		System.out.println("\n\nAFTER ROTATE :");
		int y=((a.length)-r);
		for (int i = y; i < a.length; i++)
		{
			System.out.print(a[i]+"  ");
			
		}
		for(int i=0;i<y;i++)
		{
			System.out.print(a[i]+"  ");
		}
		
	}

}
