package BASIC_PROGRAMS_CHAP_1;

import java.util.Scanner;

public class B_1 {
//	b.	The length & breadth of a rectangle and radius of a circle are input through the keyboard.
//	Write a program to calculate the area & perimeter of the rectangle, and the area & circumference of the circle.

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double len=sc.nextDouble();
		double bre=sc.nextDouble();
		
		double area_rect=len*bre;
		double para_rect=(2*(len+bre));
		
		System.out.println("area of rectangle : "+area_rect);
		System.out.println("parameter of rectangle : "+para_rect);

	}
}
