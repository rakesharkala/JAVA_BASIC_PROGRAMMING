package ARRAYS_CHAPTER_4;

import java.util.Scanner;

public class Q5_multiply_2D {
	//	5.	Write a Java Program to find the multiplication of two matrices
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		int a1[][]=new int [r][c];
		System.out.println("enter array a :");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter array b :");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a1[i][j]=sc.nextInt();
			}
		}
		System.out.println("the multipication of array is :  ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j]*a1[i][j]+" ");		
				}
			System.out.println();
		}
	
		
	}
}
