package OOPS_4;

class parent
{
	public void show()
	{
		System.out.println("THIS IS PARENT SHOW");
	}
	
}
class child extends parent
{
	public void show()  // when child have same method as parent it will override when cl that method
						//other wise it print main method,here we cen use SUPER() TO CL PARENT CLS METHOD WHEN HAVINF SAME NAME 
	{
		super.show();   // it will give parent cls method also,we can use methds ,variables ,clss 
		System.out.println("THIS IS CHILD SHOW");
	}
	
}
public class USING_SUPER_METHOD 
{
	
	public static void main(String[] args)
	{
		child obj=new child();
		obj.show();
	}

}
