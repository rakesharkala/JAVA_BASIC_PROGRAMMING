package ARRAYS_CHAPTER_4;

import java.util.Scanner;

public class Q3_insert_2D {
//	3.	Write a Java program to insert and display elements in a 2 Dimensional array
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int a[][]=new int[n][m];
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			a[i][j]=sc.nextInt();
		}
		
	}
  System.out.println("enter row no and column no to insert data : ");
  int r=sc.nextInt();
  int c=sc.nextInt();
  System.out.println("enter element :  ");
  int e=sc.nextInt();
	
	for(int i=0;i<n;i++ ) {
		for(int j=0;j<m;j++) {
			if(i==r&&j==c) {           // to compare row and column nos with user col and row
				a[i][j]=e;
			}
			//System.out.print(a[i][j]+"  ");
		}
		//System.out.println();
	}
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	
	


}
}