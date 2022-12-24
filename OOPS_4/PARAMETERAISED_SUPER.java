package OOPS_4;

class AX
{
	int i;
	public AX()
	{
		System.out.println("A CLASS ");
	}
	public AX(int j)
	{
		System.out.println("in parametaraised A"+j);
	}
}
class BX extends AX
{
	public BX()
	{
		super();
		System.out.println("in b");
	}
	public BX(int i)
	{
		super(i);
		System.out.println("in para B"+i);
	}
	
}


public class PARAMETERAISED_SUPER
{
  public static void main(String[] args) 
{
	BX obj=new BX(5);
	BX O=new BX();
	
}
}
