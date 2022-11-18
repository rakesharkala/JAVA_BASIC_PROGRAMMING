package ARRAYS_CHAPTER_1;

import java.util.Scanner;

public class Q1_a_Q2 {
	
//	1.	Insert  & Display the below elements in the array (use both compile time & run time initialization)
//	a.	139 , 12 , 34 , 5 , 566 , 7
//	b.	‘c’ , ’3’  ,  ’(‘ ,  ’?’
//	c.	“hello”, ”all”, ”good” , ”Morning” , ”453” ,  ”?<>|+_”
//	d.	true , false , true , false , true , true 
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();	
		}
		
	for(int j=0;j<n;j++) {
		System.out.print(a[j]);
		if(j<a.length-1) {
			System.out.print(",");
			
		}
	
		
	}
	System.out.println();
	System.out.print("the length of array is : "+a.length);


}
}
