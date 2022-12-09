package ARRAY_UNI_QUE;


import java.util.Scanner;

public class INSERTION_
{
 public static void main(String[] args) 
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("ENTER THE SIZE OF ARRAY : ");
	 int n=sc.nextInt();
	 System.out.println("ENTER ELEMENTS :  ");
	 int a[]=new  int[n];
	 int b[]=new int [a.length+1];
	 
	 for(int i=0;i<a.length;i++)
	 {
		 a[i]=sc.nextInt();
	 }
	 
	 System.out.print("ENTER ELEMENTS TO INSERT : ");
	 int x=sc.nextInt();
	 System.out.print("ENTER THE POSITION : ");
	 int pos=sc.nextInt();
	 for(int i=0;i<a.length;i++) 
	 {
		 if(pos==i)
		 {
			 b[i]=x;
		 }
		 else 
		 {
		 b[i]=a[i];
		 }
		 
	 }
	for(int i=0;i<a.length;i++)
	{
		System.out.println(b[i]+" ");
	}
	 
	 
}
}