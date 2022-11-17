package BASIC;


public class Product {

	public static void main(String[] args) {

		String name = "Apples";
		int code = 25;

		int quant = 10;

		int price = 100;

		int total = quant * price;
		double dis, final_price;
		System.out.println("THE PRODUCT NAME :" + name);
		System.out.println("THE CODE OF PRODUCT :" + code);
		System.out.println("THE QUANTITY OF PRODUT:" + quant);
		System.out.println("THE PRICE OF THE PRODUCT:" + price);
		System.out.println();

		if (total >= 1000) {
			dis = 20/100.0*total;     //formula
			final_price = total - dis;
			System.out.println("THE FINAL PRICE OF THE PRODUCT : " + final_price);

		} else {
			System.out.println("THE TOTAL PRICE :" + total);
		}

	}

}
