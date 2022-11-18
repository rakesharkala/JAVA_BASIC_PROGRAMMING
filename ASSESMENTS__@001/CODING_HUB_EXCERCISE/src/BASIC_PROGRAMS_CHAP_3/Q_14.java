package BASIC_PROGRAMS_CHAP_3;

import java.util.Scanner;

public class Q_14 {
//	If a five-digit number is input through the keyboard,
//	write a program to print a new number by adding one to each of its digits. 
//	For example if the number that is input is 12391 then the output should be 
//	displayed as 23402

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=24569,a;
	int r,sum=0,tot=0;
	
	 while(n>0) {
		 r=n%10;
		 n=n/10;
		 
		 if(r==9) {
			r=n%10;
			n=n/10;
			r=r+1;
			sum=sum*10+(r*10);	
		 }else {
			 r=r+1;
			 sum=(sum*10)+r;
		 }
		
	 }
	// System.out.println(sum);
	int  m=sum;
	 
	 while(m>0) {
		 int r1=m%10;
			int  r2=r1%10;
			 if(r2==0) {
				 tot=tot*100+r1;
				 m=m/100;
				
			 }
			 else {
				 r=m%10;
				 tot=tot*10+r;
				 m=m/10;
			 }
		 

	 }
	 System.out.println(tot);
}
}