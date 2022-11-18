package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class SortCheck {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}	
		   Arrays.sort(a);
		
			System.out.print("ARRAY ASSENDING ORDER : ");
			for(int i=0;i<=a.length-1;i++) {
				System.out.print(a[i]+" ");
			}
			
			System.out.println();
			System.out.print("ARRAY DECENDING ORDER  : ");
			for(int i=a.length-1;i>=0;i--) {
				System.out.print(a[i]+" ");
			}
		
		
		
		
		
	}

}
