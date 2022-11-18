package STRINGS;

import java.util.Scanner;

public class Subarray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int count=0;
	
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j] ){
				count++;
			}
		}
		
	}
	System.out.println(count);
	
}
}
