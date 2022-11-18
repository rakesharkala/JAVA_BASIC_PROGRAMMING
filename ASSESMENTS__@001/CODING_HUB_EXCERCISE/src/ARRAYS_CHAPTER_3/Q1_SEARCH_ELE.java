package ARRAYS_CHAPTER_3;

import java.util.Scanner;

public class Q1_SEARCH_ELE {
	
//	a.	Ten numbers are entered from the keyboard into an array. 
//	The number to be searched is entered through the keyboard by the user.
//	Write a program to find if the number to be searched is present in the array 
//  and if it is present, display the number of times it appears in the array.
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[10];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
		System.out.print("enter the element to search :  ");
		int n=sc.nextInt();
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				count++;
				
			}
			
		}
		System.out.print(count);
		
		
	}


}
