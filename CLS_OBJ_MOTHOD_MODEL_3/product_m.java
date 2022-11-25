package CLS_OBJ_MOTHOD_MODEL_3;

public class product_m        
{
		String name;                   
		char c;
		double dis,per;
		int tc;
		
		
		public int  t_c(int p,int q)     // METHOD 1   //MODEL 3
		{
			 tc = p*q;
			return tc;
		}

		public double dis(double total)   //METHOD 2      //MODEL 3 //MODEL 2
		{
			
			if(total>2000&&total<5000)
				dis=10;
			else if(total>5000)
				dis=20;
			else
				dis=5;
			
			dis=dis/100*total;
			total=total-dis;
			
			return total;
		}
		public void dispaly(double fv)   //METHOD 3   MODEL 1 P2
		{
			System.out.println("PRODUCT NAME         :  "+name );
			System.out.println("PRODUCT ID           :  "+c );
			System.out.println("PRODUCT TOTAL        :  "+tc);
			System.out.println("PRODUCT DISCOUNT     :  "+dis);
			System.out.println("PRODUCT FINAL_PRICE  :  "+fv );
			
		}
	
		public void con()                  // MODEL 1
		{                                    
			
			System.out.println("THANK YOU FOR CHOOSING US !!");
			
		}
		


}
