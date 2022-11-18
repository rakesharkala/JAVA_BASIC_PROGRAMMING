package ARRAYS_CHAPTER_4;

import java.util.Scanner;

public class Q6_sum_of_diagoanl {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int a[][] = new int[r][c];
		int sum = 0;

		System.out.println("enter array :  ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < r; i++) 
		{
			for (int j = i; j <= i; j++) { // i=0,j=0>>>i==1,j==1,i==2,j==2
				sum += a[i][j];
			}
		}
		System.out.println(sum);
	}

}
