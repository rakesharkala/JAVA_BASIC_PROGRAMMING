package OOPS;


/*
 *   What is Polymorphism
	 The word Polymorphism, in general, is made up of two words poly:
	 meaning many and morph: meaning form. 


	Definition
	Hence, polymorphism can be defined as the ability to use an operator or
	 a function in different ways. An operation may exhibit different behavior 
	 and different instances, which depends upon the types of data used in the operation.
 */
//Concatenated String- HeyPrepster
//Runtime Polymorphism
//Runtime or dynamic Polymorphism is the polymorphism which resolves dynamically at the 
//runtime rather than compile-time is called. We can also call it as dynamic binding or
//Dynamic Method Dispatch. Since the method invocation is during runtime and not during 
//compile-time, this type of polymorphism is called Runtime or dynamic polymorphism.
//
//We can achieve dynamic polymorphism in Java with the help of Method Overriding.
//
//In an object-oriented language, Method overriding occurs when a derived class provides a specific definition of the method that is already present in its parent class. We say that the function in the base class is being overridden.
//
//Run
class Animal { 
  
    void Print() 
    { 
        System.out.println("parent class"); 
    } 
} 
  
class Dog extends Animal { 
  
    void Print() 
    { 
        System.out.println("Dog barks"); 
    } 
} 
  
class Cat extends Animal { 
  
    void Print() 
    { 
        System.out.println("Cat meows"); 
    } 
} 
  
public class POLY_RUN_TIME {
    public static void main(String[] args) 
    { 
  
        Animal a; 
  
        a = new Dog(); 
        a.Print(); 
  
        a = new Cat(); 
        a.Print(); 
    } 
} 




