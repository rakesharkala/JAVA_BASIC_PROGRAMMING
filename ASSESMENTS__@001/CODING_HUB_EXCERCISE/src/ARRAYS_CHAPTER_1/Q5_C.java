package ARRAYS_CHAPTER_1;

import java.util.Scanner;

public class Q5_C {
//	i.	Print the First half in reverse order and print the whole array
//	ii.	Print the Second half in reverse order and print the whole array
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
//		// 1st part  i ans
//		for(int i=arr.length/2;i>0;i--) {
//			System.out.print(arr[i]+"  ");
//		}//2nd part 
//		
//		System.out.println();
//		for(int i=arr.length/2+1;i<=arr.length-1;i++) {
//			System.out.print(arr[i]+"  ");
//		}
//		
	
		// ii ans 1st part
		for(int i= arr.length-1;i>=arr.length/2;i--) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		for(int i=0;i<arr.length/2;i++) {
			System.out.print(arr[i]+"  ");
		}
	
	System.out.println();
	
	
	}


}
