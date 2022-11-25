package CLS_OBJ_MOTHOD_MODEL_3;

import java.util.Scanner;

import CLS_OBJ_METHOD_MODEL_2.pro_methods;

public class PRODUCT_MAIN 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		product_m p = new product_m();
		int x;
		do {
			
		System.out.print("ENTER PRODUCT NAME     :  ");	
		String name = sc.next();
		System.out.print("ENTER PRODUCT CODE     :  ");
		char code = sc.next().charAt(0);
		System.out.print("ENTER PRODUCT PRICE    :  ");
		int price = sc.nextInt();
		System.out.print("ENTER PRODUCT QUANTITY :  ");
		int quan = sc.nextInt();
		System.out.println("\n");

		
		p.name=name;
		p.c=code;
		double total=p.t_c(price, quan);
		double fv=p.dis(total);
		
		p.dispaly(fv);
		
		System.out.print(" \n\nENTER 1 TO CONTINUE : ");
		x=sc.nextInt();
		System.out.println("\n");
		
		}while(x==1);
		
		p.con();
	}

}

