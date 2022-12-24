package OOPS_4;

//ENCAPSULATION  :  IT IS PROCESS OF WRAPPING VARIABLE AND MEHTODS TOGETHER SINGLE UNIT
//CODE+DATA
//USING GETTERS AND SETTERS
//ADV :PRIVACY

public class ENCAPSULATION_EX1
{
	public static void main(String[] args) 
	{
		
		encapsulation_methods obj=new encapsulation_methods();
		
		obj.setName("RAKESH");
		obj.setId(2);
		obj.setInfo("student ");
		
		encapsulation_methods o=new encapsulation_methods();
		
		o.setName("ANIL");
		o.setId(1);
		o.setInfo("EMPLOYEE");
		
		String n=obj.toString();      // tostring is generally used to display all getter setter methods or normall method information
		String s=o.toString();
		
		System.out.println(n+"\n"+s);
		
		System.out.println(obj.getName());
		System.out.println(obj.getId());
		System.out.println(obj.getInfo());
		
		System.out.println();
		System.out.println(o.getName());
		System.out.println(o.getId());
		System.out.println(o.getInfo());
	}
	

}
