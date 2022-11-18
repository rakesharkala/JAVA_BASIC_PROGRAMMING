import java.util.*;
import java.util.Scanner;

class Armstrong{
	public static void main(String ... args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();  // 153 =1^3+5^3+3^3  153
		int sum=0,r,temp;
		temp=n;
		
		while(n>0) {
			
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;
		}
		if(temp==sum) {
			System.out.println("Armstrong no");
		}
		else {
			System.out.println("not an Armstrong");
		}
		
	}
}
