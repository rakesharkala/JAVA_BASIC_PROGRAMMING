package CLS_OBJ_METHOD_MODEL_1;

public class BASIC
{
  public static void main(String[] args) 
  {
	  sub_cls obj;
	  obj=new sub_cls();	//object creation
	  obj.a=10;             //value assigning 
	  obj.b=20;
	  obj.method_1();        //calling method
	
  }
}
class sub_cls            // class creation 
{
	int a,b;			// variables
	
	public void method_1()   	//method intialization
	{
		a=a+b;                  //group of stmts
		b=a-b;
		System.out.println(a+"   "+b);
	}
}
