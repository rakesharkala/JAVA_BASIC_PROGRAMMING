package ARRAYS_CHAPTER_1;

import java.util.Arrays;
import java.util.Scanner;

public class Q8 {
//	8.	Divide the array into two equal halves
//	a.	First half in ascending order, second half in descending order  
	
	public static void main(String[] args) {

	  int arr[]= {10,77,5,66,44,1};
	  
	  //System.out.print("1st half of an array :  ");
	  for(int i=0;i<(arr.length/2);i++) {                       // sort method not worked in this case
		  for(int j=i+1;j<(arr.length/2);j++) {
			  if(arr[i]>arr[j]) {
				 int temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
			  }
		  }
		  System.out.println(arr[i]);
  
	  }
	  for(int j=arr.length/2;j<arr.length;j++) {
		  for(int i=j+1;i<arr.length;i++) {
			  if(arr[j]<arr[i]) {
				  int temp=arr[j];
				  arr[j]=arr[i];
				  arr[i]=temp;
			  }
		  }
		  System.out.println(arr[j]);
	  }
		  
	  }
	}

