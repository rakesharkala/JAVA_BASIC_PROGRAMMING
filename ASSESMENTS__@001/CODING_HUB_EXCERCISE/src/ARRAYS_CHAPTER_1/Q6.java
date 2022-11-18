package ARRAYS_CHAPTER_1;

import java.util.Scanner;

//6.	Swap the adjacent elements in the array

class Q6{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
			System.out.print(arr[i++]+"   "+arr[i]+"       ");
			
			
		}
		

	}
}