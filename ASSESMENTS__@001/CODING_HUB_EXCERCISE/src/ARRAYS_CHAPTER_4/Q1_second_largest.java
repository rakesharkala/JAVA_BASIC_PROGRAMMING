 package ARRAYS_CHAPTER_4;

import java.util.Arrays;

public class Q1_second_largest {

//	Chapter IV 
//	1.	Write a java Program to find the second largest & smallest number in the array(use sorting)


	public static void main(String[] args) {
		
		int a[]= {12,44,5,4,9,45,75,99};
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		//Arrays.sort(a);
			for(int i=1;i<a.length;i++) {
				if(i==2||i==a.length-2) {
					System.out.println(a[i]+" ");
				}

		}
		
	
}
}
