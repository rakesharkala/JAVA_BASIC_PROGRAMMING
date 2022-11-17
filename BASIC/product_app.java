package BASIC;
public class product_app {


		public static void main(String[] args) {

			String name = "Apples";
			int code = 25;

			int quant = 10;

			int price = 100;

			int total = quant * price;
			
			double dis1= 5/100.0*total;
			double final_price1=total-dis1;
			 
			double dis2=10/100.0*total;
			double final_price2=total-dis2;
			
			System.out.println("THE PRODUCT NAME        :  " + name);
			System.out.println("THE CODE OF PRODUCT     :  " + code);
			System.out.println("THE QUANTITY OF PRODUT  :  " + quant);
			System.out.println("THE PRICE OF THE PRODUCT:  " + price);
			System.out.println();
			
			if(total>2000) {
				System.out.println("THE FINAL PRICE OF PRODUCT : "+final_price2);
			}
			else {
				System.out.println("THE FINAL PRICE OF PRODUCT : "+final_price1);
			}
				
		
			

			

	}


}
