package ARRAYS_CHAPTER_4;

import java.util.Scanner;

public class Q4_suM_add_2D {
//	4.	Write a Java program to find the sum , subtraction of two matrices 
  public static void main(String[] args) {
	  
	  Scanner sc=new Scanner (System.in);
	  int r=sc.nextInt();
	  int c=sc.nextInt();
	  
	  int a[][]=new int [r][c];
	  int a1[][] = new int[r][c];  
	  int[][] sum = new int[r][c];
	  int [][]sub = new int [r][c];
	  
	  System.out.println("enter a and a1 array elements:");
	  for(int i=0;i<r;i++) {
		  for(int j=0;j<c;j++) {
			  a[i][j]=sc.nextInt();
			 
			//    sum[i][j]=a[i][j]+a1[i][j];
			  //  sub[i][j]=a[i][j]-a1[i][j];
		 
		  }
	  }
	  for(int i=0;i<r;i++) {
		  for(int j=0;j<c;j++) {
			//  a[i][j]=sc.nextInt();
			  a1[i][j] = sc.nextInt();
			//    sum[i][j]=a[i][j]+a1[i][j];
			  //  sub[i][j]=a[i][j]-a1[i][j];
		 
		  }
	  }
	  for(int i=0;i<r;i++) {
		  for(int j=0;j<c;j++) {
			
			 
			 
			sum[i][j]=a[i][j]+a1[i][j];
			  //  sub[i][j]=a[i][j]-a1[i][j];
		 
		  }
	  }
	  for(int i=0;i<r;i++) {
		  for(int j=0;j<c;j++) {
			
			 
			 
		sub[i][j]=a[i][j]-a1[i][j];
			  //  sub[i][j]=a[i][j]-a1[i][j];
		 
		  }
	  }
	  
	  
	
	  System.out.println("the sum of 2 matrix :  ");
	  for(int i=0;i<r;i++) {
		  for(int j=0;j<c;j++) {
			  System.out.print(sum[i][j]+" ");
		  }
		  System.out.println();
	  }
	  System.out.println();
	  System.out.println("the sub f 2 matrix : ");
	  for(int i=0;i<r;i++) {
		  for(int j=0;j<c;j++) {
			  System.out.print(sub[i][j]+" ");
		  }
		  System.out.println();
	  }
	  
	 
	
}
}
