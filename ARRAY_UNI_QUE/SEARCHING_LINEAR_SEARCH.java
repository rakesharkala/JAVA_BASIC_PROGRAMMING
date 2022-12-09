package ARRAY_UNI_QUE;

import java.util.Scanner;

public class SEARCHING_LINEAR_SEARCH 
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
    	 
    	 System.out.print("ENTER ELEMENTS TO SEARCH : ");
    	 int x=sc.nextInt();
    	 int j=0,pos=0;
    	 for(int i=0;i<a.length;i++)
    	 {
    		 if(a[i]==x)
    		 {
    			 j=a[i];
    			 pos=i;
    		 }
    	 }
    	 if(j!=0)
    	 {
    		 System.out.println("ELEMENT FOUND : "+j+"\nAT INDEX OF : "+pos);
    	 }
    	 else {
    		 System.out.println("ELEMENT NOT FOUND");
    	 }
    	 
		
	}
}
