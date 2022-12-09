package ARRAY_UNI_QUE;

import java.util.Scanner;

public class SORTING_BUBBLE_SORT
{
  public static void main(String[] args) 
  {
	  Scanner sc=new Scanner (System.in);
	  int n=sc.nextInt();
	  
	  int a[]=new int [n];
	  
	  for(int i=0;i<a.length;i++)
	  {
		  a[i]=sc.nextInt();
		  
	  }
	  
	  for(int i=0;i<a.length;i++)
	  {
		  for(int j=i+1;j<a.length;j++)
		  {
			  	if(a[i]>a[j])
			  	{
			  		int temp=a[i];
			  		a[i]=a[j];
			  		a[j]=temp;
			  	}
		  }
	  }
	  System.out.println("THE ARRAY AFTER SORT : ");
	  for (int i : a) {
		System.out.print(i+"  ");
	}
	
}

}
