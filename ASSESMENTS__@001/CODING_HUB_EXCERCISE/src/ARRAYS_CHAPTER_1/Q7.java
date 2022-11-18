package ARRAYS_CHAPTER_1;

import java.util.Scanner;
import java.util.Arrays;

public class Q7 {
	//7.	Sort the array elements both in ascending and descending order
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		
			
		}
		System.out.print(" before sort :    ");
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+"   ");
		}
		System.out.println();
		
		
		Arrays.sort(arr);  // sort method
		
		System.out.print("assending order :  ");
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+"   ");
		}
		System.out.println();
		
		System.out.print("desending order :  ");
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+"   ");
		}
	}
	

}
