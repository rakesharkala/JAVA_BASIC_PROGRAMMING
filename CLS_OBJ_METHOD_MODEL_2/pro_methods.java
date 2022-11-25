package CLS_OBJ_METHOD_MODEL_2;

public class pro_methods
{
	String name;
	char c;
	int p,q,d;
	double dis,total;
	
	public void t_c(int price, int quan)
	{
		total=p*q;
		d=(int) total;
		
		if(total>5000)
		{
			dis=15;
			dis=dis/100*total;
			total=total-dis;
		}
		if(total>2000&&total<5000)
		{
			dis=10;
			dis=dis/100*total;
			total=total-dis;	
		}
		else {
			dis=5;
			dis=dis/100*total;
			total=total-dis;
			
		}
	}
	
	public void dispaly() 
	{
		System.out.println("PRODUCT NAME       :  "+name +"\n");
		System.out.println("PRODUCT ID         :       "+c +"\n");
		System.out.println("PRODUCT TOTAL      :  "+d +"\n");
		System.out.println("PRODUCT DISCOUNT   :  "+dis +"\n");
		System.out.println("PRODUCT FINAL_PRICE  :  "+total +"\n");
		
	}
	
	

}
