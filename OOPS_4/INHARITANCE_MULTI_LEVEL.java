package OOPS_4;


class cal
{
	int a, b, sum;
	
	public int add()
	{
		sum=a+b;
		return sum;
	}
	
}
class av extends cal
{
	public int sub()
	{
		sum=a-b;
		return sum;
	}
}
class vad extends av
{
	public int mul()
	{
		sum=a*b;
		
		return sum;
	}
	
}
public class INHARITANCE_MULTI_LEVEL
{

	public static void main(String[] args) 
	{

		vad obj=new vad();   // WE HAVE TO CREATE OBJ FOR LATEST EXTENDED TO ALL MAIN CLASSES
		obj.a=10;
		obj.b=15;
		
		int a=obj.add();
	    int b=obj.sub();
	    int s=obj.mul();
		
		System.out.println(a+"\n"+b+"\n"+s);
	}

}
// MULTIPLE INHARITANCE DOESNT WORK IN JAVA 
// IT GIVE AMBIGUITY PROBLEM  // MULTIPLE INHARITANCE ACHIVE WITH INTERFACES