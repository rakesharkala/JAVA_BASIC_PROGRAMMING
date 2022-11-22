package CLS_OBJ_METHOD_MODEL_1;

public class PRODUCT_APPLICATION
{
   public static void main(String[] args)
   {
	   product_methods pm=new product_methods();
	   pm.pname="APPLES";
	   pm.id=1;
	   pm.q=5;
	   pm.price=1000;
	   
	   pm.total();
	   pm.disc();
	   pm.display();
	   
	   
	   product_methods p=new product_methods();
	   p.pname="MANGOES";
	   p.id=2;
	   p.q=50;
	   p.price=200;
	   
	   p.total();
	   p.disc();
	   p.display();
	
}
}
