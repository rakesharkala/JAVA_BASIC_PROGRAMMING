package ARRAYS_CHAPTER_1;

import java.util.Scanner;

public class Q5_B {
	//b.5	Divide the array into two equal halves 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();

		}
        //1st half
		for (int j = 0; j < a.length / 2; j++) {
			System.out.println("the first half " + a[j]);
		}
		
		//2nd half
		for (int i = a.length / 2; i <= a.length - 1; i++) {
			System.out.println();
			System.out.print("the 2nd half of array: " + a[i]);
		}
	}
}