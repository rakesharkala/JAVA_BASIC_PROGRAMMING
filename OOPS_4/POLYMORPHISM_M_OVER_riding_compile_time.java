package OOPS_4;
// 2 TYPES
//1.COMPILE TIME
//2.RUN TIME
// WE CAN PERFORM POLYMORPHISM IN JAVA BY METHOD OVERLOADING AND METHOD OVERRIDEING
// IF WE OVERLOAD THE STATIC METHOD IN JAVA , ITS IS EXAMPLE OF COMPILE TIME POLYMORPHISM
//RUN TIME POLYMORPHISM OR DYNAMIC METHOD DISPATCH
// ID A PROCESS ,IN WHICH A CALL TO AN OVER RIDDEN METHOD IS RESOLVED AT RUNTIME RATHER THEN COM[PILE TIME


// UPCASTING :  A OBJ=NEW B()


class parent1
{
	int i;
	public  void show(int i)
	{
		
		System.out.println("this is main class method show"+i);
		
	}
}
class child1 extends parent1
{
	
	@Override  
	public  void show(int j)
	{
		super.i=j+5;
		super.show(i);              // it will call the main method
		System.out.println("this is child cls method show"+j);
	}
}
public class POLYMORPHISM_M_OVER_riding_compile_time
{
	public static void main(String[] args) 
	{
		child1 obj=new child1();
		obj.show(5);

	}
   
   
}
