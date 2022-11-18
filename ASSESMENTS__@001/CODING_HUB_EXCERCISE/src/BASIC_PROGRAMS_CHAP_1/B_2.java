package BASIC_PROGRAMS_CHAP_1;

import java.util.Scanner;

public class B_2 {
// area & circumference of the circle.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int r=sc.nextInt();
		double rad=3.14;
		double area=rad*r*r;  //rad*R*R
		double circum=2*rad*r;  //C=2πr
		
		System.out.println("the area of circle :"+area);
		System.out.println("the circumference of the circle :  "+String.format("%.2f",circum));
	}
}
// string.format method used to control the decimal points
