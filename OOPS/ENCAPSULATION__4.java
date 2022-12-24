package OOPS;

/*
 * * Encapsulation
	 Encapsulation in Java is a process of wrapping code and data together under a 
	 single unit. In other words, we can say that it is a process of binding a code and the
	 data that manipulates it under the same unit. It prevents external access to the data
	 
	 It is also known as Data Hiding. To achieve encapsulation in Java −
     Declare the variables of a class as private.
     Provide public setter and getter methods to modify and view the values of the variables
 */
public class ENCAPSULATION__4
{
	  public static void main (String[] args)  
	    { 
	       encapsulation_methods obj = new encapsulation_methods (); 
	          
	        obj.setAge(22);  
	        obj.setName("Ashwin"); 
	        obj.setCity("Meerut"); 
	        
	        System.out.println("Prepster's age: " + obj.getAge());
	        System.out.println("Prepster's name: " + obj.getName()); 
	        System.out.println("Prepster's city: " + obj.getCity()); 
	          
	              
	    } 

}
