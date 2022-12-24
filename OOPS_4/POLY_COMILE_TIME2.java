package OOPS_4;


//	Compile-time Polymorphism
//	Also known as Static polymorphism, is the type of polymorphism that is resolved at the time 
//  of compilation. It can be achieved by either method overloading or operator overloading.
//
//	When there are multiple functions with the same name but different parameters then these
//  functions are said to be overloaded. Functions can be overloaded by a change in the number 
//  of arguments or/and change in the type of arguments.
//	For example, we can make the operator (‘+’) for string class to concatenate two strings.
//  We know that this is the addition operator whose task is to add two operands.
//  So a single operator ‘+’ when placed between integer operands, adds them and when placed
//  between string operands, concatenates them.
//	Example
//	Run
	class ComplitetimePolymorph { 
	  
	    void operator(String str1, String str2) 
	    { 
	        String s = str1 + str2; 
	        System.out.println("Concatenated String - " + s); 
	    } 
	  
	    void operator(int a, int b) 
	    { 
	        int c = a + b; 
	        System.out.println("Sum = " + c); 
	    } 
	} 
	  
	public class POLY_COMILE_TIME2 
	{
	    public static void main(String[] args) 
	    { 
	        ComplitetimePolymorph obj = new ComplitetimePolymorph(); 
	        obj.operator(10, 20); 
	        obj.operator("Hey", "Prepster"); 
	    } 
	} 
	

	