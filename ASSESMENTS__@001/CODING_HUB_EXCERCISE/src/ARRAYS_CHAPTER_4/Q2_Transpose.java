package ARRAYS_CHAPTER_4;

import java.util.Scanner;

public class Q2_Transpose {
//	7.	Write a Java program to find the Transpose of a matrix
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();

	int a[][]=new int[n][m];
	int tr[][]=new int[n][m];
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			a[i][j]=sc.nextInt();
			
		}
	}
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			tr[i][j]=a[j][i];   // to transpose the array
		}
	}
	System.out.println("transpose matrix is :  ");
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			System.out.print(tr[i][j]+"  ");
		}
		System.out.println();
	}
}
}
