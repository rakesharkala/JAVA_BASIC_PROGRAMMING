package ARRAYS_CHAPTER_1;

import java.util.Scanner;

public class Q5_A {
   //a.	Print the above array in reverse order
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			
			System.out.println("THE REVERSE ORDER OF ABOVE ARRAY IS : ");
			
			for(int j=arr.length-1;j>=0;j--) {
				System.out.print(arr[j]+"  ");
			}
	}
}
