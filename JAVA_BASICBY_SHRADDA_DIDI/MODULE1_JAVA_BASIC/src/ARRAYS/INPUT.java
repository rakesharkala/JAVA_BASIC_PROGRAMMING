package ARRAYS;

import java.util.Scanner;

public class INPUT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the array length : ");
		int n = sc.nextInt();
		
		System.out.println("The values  are : ");
		int arr[] = new int[n];
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("THE ARRAY LOOK LIKE :  ");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(+arr[i] + "  ");
		}

	}

}
