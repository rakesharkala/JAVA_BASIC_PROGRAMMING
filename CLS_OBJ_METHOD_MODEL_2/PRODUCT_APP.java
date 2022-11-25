package CLS_OBJ_METHOD_MODEL_2;

import java.util.Scanner;

public class PRODUCT_APP
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		String name=sc.next();
		char code=sc.next().charAt(0);
		int price=sc.nextInt();
		int quan=sc.nextInt();
		
		pro_methods p=new pro_methods ();
		p.name=name;
		p.c=code;
		p.p=price;
		p.q=quan;
		
		p.t_c(price, quan);
		p.dispaly();
	
		
		
	}

}
