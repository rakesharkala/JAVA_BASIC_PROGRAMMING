package BASIC;

import java.util.Scanner;

public class If_else_employee_app {

	public static void main(String[] args) {
		
		Scanner sc=new  Scanner(System.in);
		
		System.out.print("enter the product name :");
		String pname=sc.next();
		 
		System.out.print("enter product quantity :");
		int q=sc.nextInt();
		
		System.out.print("enter product price :");
		int p=sc.nextInt();
		System.out.println();
		
		int total_price=q*p;
		
		double dis1= 5/100.0*total_price;
		double dis2=10/100.0*total_price;
		double final_price;
		
		if(total_price>2000) {
			final_price =total_price-dis2;
		}
		else {
			final_price =total_price-dis1;
		}
		
		System.out.println("THE NAME OF PRODUCT            :  "+pname);
		System.out.println("THE QUANTITY OF THE PRODUCT IS :  "+q);
		System.out.println("THE PRODUCT PRICE              :  "+p);
		System.out.println("THE PRICE BEFORE DISCOUNT      :  "+total_price);
		System.out.println("THE TOTAL BILL OFTER DISCOUNT  :  "+final_price);
	}
	
}
