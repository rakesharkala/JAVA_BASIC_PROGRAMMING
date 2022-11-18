package ARRAYS_CHAPTER_1;

import java.util.Scanner;

public class Q1_c_Q2 {
//	“hello”, ”all”, ”good” , ”Morning” , ”453” ,  ”?<>|+_”
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);


		String s[] = new String[6];

		for (int i = 0; i < s.length; i++) {
			s[i] = sc.next();
		}
		for (int j = 0; j < s.length; j++) {
			System.out.print(" ,," + s[j] + ",," + "  ");
		}
		
		System.out.println();
		System.out.println("the lenght of array is :"+s.length);
	}

}
