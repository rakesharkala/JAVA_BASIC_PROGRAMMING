package ARRAYS_CHAPTER_1;

import java.util.Scanner;

public class Q4 {
	
	//4.	Find the length of all the above arrays without using method length
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s[]=new String[10];
		int count=0;
		for(int i=0;i<s.length;i++) {
			s[i]=sc.next();
			count++;
		
	}
		for(String i:s) {
			System.out.print(i+" ");
		}
		System.out.println("the length of an array is :"+count);
		System.out.println();
		System.out.println();
		System.out.println("the length of an array is using method  :"+s.length);
}
}