package ARRAYS;

import java.util.Scanner;

public class Max_Min_Value {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the n value : ");
		int n=sc.nextInt();
		int array[]=new int[n];
		
		System.out.println("The array look like this :  ");
		for(int i=0;i<=array.length-1;i++) {
			array[i]=sc.nextInt();
			
		}
		int min=Integer.MIN_VALUE;
		int max=Integer.MAX_VALUE;
		
		for(int i=0;i<=array.length-1;i++) {
			if(array[i]<min) {
				min=array[i];
				
			}
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println("The min value of an array : "+min);	
		System.out.println("The max value of an array : "+max);
	}

}
