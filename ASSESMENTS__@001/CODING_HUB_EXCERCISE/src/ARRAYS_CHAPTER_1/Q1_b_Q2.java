package ARRAYS_CHAPTER_1;

import java.util.Scanner;

public class Q1_b_Q2 {
	
//	b.	‘c’ , ’3’  ,  ’(‘ ,  ’?’
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		String s[] = new String[10];
		
		for(int i=0;i<s.length;i++) {
			s[i]=sc.next();
		}
		for(int j=0;j<s.length;j++) {
			System.out.print("'"+s[j]+"'"+"  ");
		}
		System.out.println();

		System.out.println("the length of array is : "+s.length);
		
		
	}

}
