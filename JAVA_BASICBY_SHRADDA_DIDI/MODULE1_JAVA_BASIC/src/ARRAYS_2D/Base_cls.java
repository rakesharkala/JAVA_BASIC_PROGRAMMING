package ARRAYS_2D;

import java.util.Scanner;

public class Base_cls {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the rows :");
		int row=sc.nextInt();
		
		System.out.print("Enter thr columns :");
		int col=sc.nextInt();
		
		int a[][]=new int[row][col];
		 										//row -----------
		for(int i=0;i<row;i++) {				//column ||
			for(int j=0;j<col;j++) {			//		 ||
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println();
		System.out.println("The Multidimensional array is : ");
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
