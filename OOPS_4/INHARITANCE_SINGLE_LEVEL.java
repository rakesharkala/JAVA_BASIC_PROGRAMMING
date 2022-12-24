package OOPS_4;

class A
{
	int a,b,sum;
	
	public void add()
	{
		sum=a+b;
		System.out.println(sum);
		System.out.println("THIS IS PARENT CLASS");
	}
}
class B extends A
{
	public void sub()
	{
		sum=a-b;
		System.out.println(sum);
		System.out.println("THIS IS CHILD CLASS");
	}
}
public class INHARITANCE_SINGLE_LEVEL 
{
	public static void main(String[] args) 
	{
		B obj=new B();   // WE HAVE TO CREATE OBJ TO CHILD CLASS B/S WE CAN UPDATE LATESTLY CHILD
		obj.a=10;
		obj.b=5;
		obj.add();
		obj.sub();
		
		
	}

}
