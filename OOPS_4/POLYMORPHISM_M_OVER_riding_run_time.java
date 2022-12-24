package OOPS_4;

// INTHIS WE CAN CREATE REF OF SUPER CLS & OBJ OF CHILD CLS
// HERE WE CAN CALL ONLY SUPER CLS METHODS PRESENTED IN CHILD CLS


class cal1
{
	public void show()
	{
		System.out.println(" in a");
	}
}
class sub extends cal1
{
	public void show()
	{
		super.show();
		System.out.println("in sub");
	}
	public void add ()
	{
		System.out.println("add in sub cls");
	}
}


class mul extends cal1
{
	public void show()
	{
		System.out.println("this is mul 3rd cls");
	}
}
public class POLYMORPHISM_M_OVER_riding_run_time  // DYNAMIC DISPATCH METHOD
{
	public static void main(String[] args)
	{
		
		cal1 obj;
		obj = new sub();
		obj.show();

		obj = new mul(); // dynamic method dispatch
		obj.show();
		
		
		//obj.add();  we cant access like this 
	
		
         //		obj=new sub();
		
	}

}
