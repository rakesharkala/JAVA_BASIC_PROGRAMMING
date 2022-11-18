package ARRAYS_CHAPTER_4;

import java.util.Scanner;

public class Q2_1_sendond_large_without_sort {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {

			a[i] = sc.nextInt();

		}
		int high = Integer.MIN_VALUE;
		int second_high = Integer.MIN_VALUE;
		
		int small=Integer.MAX_VALUE;
		int sec_small=Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {

			if (a[i]>high) {
				second_high=high;
				high = a[i];
				
			}
			if (a[i]<high&&a[i]>second_high) {
				second_high = a[i];

			}
		}

		System.out.println(second_high+" ");
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]<small) {
				sec_small=small;
				small=a[i];
				
			}
			if(a[i]>small&&a[i]<sec_small) {
				sec_small=small;
			}
		}
		System.out.println(sec_small);

	}
}