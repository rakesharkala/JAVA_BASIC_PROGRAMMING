package ARRAYS;

import java.util.Scanner;

public class DELETE_ELE_
{
	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
    	 System.out.print("ENTER THE SIZE OF ARRAY : ");
    	 int n=sc.nextInt();
    	 System.out.println("ENTER ELEMENTS :  ");
    	 int a[]=new  int[n];
    	 
    	 for(int i=0;i<a.length;i++)
    	 {
    		 a[i]=sc.nextInt();
    	 }
    	 System.out.print("ENTER ELEMENT TO DELETE : ");
    	 int x=sc.nextInt();
    	 
    	 for(int i=0;i<a.length;i++)
    	 {
    		 if(a[i]==x)
    		 {
    			 a[i]=-1;
    		 }
    	 }
    	 for(int i=0;i<a.length;i++)
    	 {
    		 if(a[i]!=-1)
    		 {
    			 System.out.print(a[i]+"  ");
    		 }
    	 }
    	 
		
	}

}
