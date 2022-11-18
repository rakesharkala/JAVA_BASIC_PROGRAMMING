package ARRAYS_2D;

import java.util.Scanner;

public class Search_no {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter row value : ");
		int row=sc.nextInt();
		System.out.print("Enter column value  :");
		int col=sc.nextInt();
		
		int arr[][]=new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				
				arr[i][j]=sc.nextInt();
				
			}
		}
		System.out.print("ENTER NUMBER TO SEARCH :  ");
		int x=sc.nextInt();
		
		for(int i=1;i<row;i++) {
			for(int j=1;j<col;j++) {
				if(arr[i][j]==x) {
					System.out.print("THE NO FOUND AT : "+ i +"  "+j);
				}
			}
		}
		
	}

}
