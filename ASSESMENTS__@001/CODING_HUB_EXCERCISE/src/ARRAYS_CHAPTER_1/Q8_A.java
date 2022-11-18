package ARRAYS_CHAPTER_1;

import java.util.Arrays;
import java.util.Scanner;

public class Q8_A {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		int a1[]=new int[arr.length/2];
		int a2[]=new int[arr.length/2];
	
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int j=0;j<arr.length/2;j++) {
			arr[j]=a1[j];
			
		}
		
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+"  ");
		}
		
	
		Arrays.sort(a1);
		System.out.println();
		
		for(int k=0;k<=a1.length;k++) {
			System.out.print(a1[k]+" ");
		}
		
		
	}

}
