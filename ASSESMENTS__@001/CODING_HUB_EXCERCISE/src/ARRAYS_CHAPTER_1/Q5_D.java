package ARRAYS_CHAPTER_1;

import java.util.Scanner;

public class Q5_D {
//	Print only even indexed elements
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.print(arr[i]+"   "+"INDEX NO : "+i);
			}
			System.out.println();
		}
		
		
	}
}
