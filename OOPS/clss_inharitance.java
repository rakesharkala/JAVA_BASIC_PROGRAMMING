package OOPS;

import java.util.Scanner;

class main
{
	int id;
	String name;
	double price, dis, total, f_price;
	int q;
	Scanner sc = new Scanner(System.in);
	
	public void input()
	{
		System.out.println("====>WELCOME TO THE APPLICATION S LIFE <=====\n\n");

		System.out.println("ENTER NAME OF THE PRODUCT : ");
		name = sc.next();
		System.out.println("ENTER PRODUCT ID : ");
		id = sc.nextInt();
		System.out.println("ENTER PRICE OF THE PRODUCT : ");
		price = sc.nextDouble();
		System.out.println("ENTER APPLICABLE DISCOUNT ON PRODUCT : ");
		dis = sc.nextDouble();

		System.out.println("ENTER QUANTITY :  ");
		q = sc.nextInt();
	}

	public void total() {
		total = price * q;

	}

	public void f_p() {
		f_price = total - dis;
	}

	
}
class sub extends main      // SUB CLASS EXTENDING MAIN CLASS 
{
	
	
	public void dis()
	{
		super.input();       // WITH THE SUPER KEY WORD WE ARE CALLING PARENT CLASS METHODS 
		super.total();
		super.f_p();
		
		System.out.println("THE NAME OF PRODUCT : " + name);
		System.out.println("ID OF THE PRODUCT : " + id);
		System.out.println("PRICE OF THE PRODUCT : " + price);
		System.out.println("THE DISCOUNT OF THE PRODUCT : " + dis);
		System.out.println("\n");
		System.out.println("THE FINAL PRICE OF THE PRODUCT : "+f_price);
	}
	
	public void cl()
	{
		System.out.println("THANK YOU FOR CHOOSING US : ");
	}
	
}
