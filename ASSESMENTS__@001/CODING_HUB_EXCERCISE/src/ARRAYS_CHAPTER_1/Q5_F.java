package ARRAYS_CHAPTER_1;

import java.util.Scanner;

public class Q5_F {

//	5.	12 , 56 , 34 , 23 ,67 , 76 , 32 , 75 , 90 , 345
//	a.	Print the above array in reverse order
//	b.	Divide the array into two equal halves 
//	i.	Print the First half in reverse order and print the whole array
//	ii.	Print the Second half in reverse order and print the whole array
//	c.	Print only even indexed elements
//	d.	Print only odd indexed elements
//	e.	Print the elements which are divisible by 4 
//	f.	Print the indices which are divisible by 3  ***********************<<<<<<<<--------------------<<<<
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		
	   int arr[]=new int[n];
	   
	   for(int i=0;i<arr.length;i++) {
		   arr[i]=sc.nextInt();
		   
	   }
	   
	   for(int i=0;i<arr.length;i++) {
		   if(i%3==0) {
			   System.out.print(arr[i]+"  "+ i);
		   }
		   System.out.println();
	   }
	
	}

}
