package OOPS_4;

import OOPS.bike;
import OOPS.car;

/*
 * Abstract class
 * 
    In Java, an abstract class is one that has the abstract keyword declared in its declaration.
    An abstract class is a restricted class that cannot be used to create objects.
     Both abstract and non-abstract methods are possible.



Abstraction in Java
Data Abstraction is the process of withholding some information from the user and only 
displaying what is absolutely necessary. In a different way, it only displays the user’s 
needs and hides internal information, such as when sending SMS, where you type the text and
 send the message. You are unaware of the internal message delivery processing.
 
Important Points To Be Remember :

An abstract keyword must be used when declaring an abstract class.
Both abstract and non-abstract methods are possible.
You can’t instantiate it.
Both static methods and constructors are possible.
It may have final methods that compel the subclass not to alter the method body.

Syntax :
public abstract class GraphicObject {
   // declare fields
   // declare non abstract methods
   abstract void draw();
}
 */
public class ABSTRACTION_PENDING2 
{
    public static void main(String[] args) {
        car c = new car();
        bike b = new bike();
        c.start();
        c.stop();
        c.accelerate();
        c.brake();
        b.start();
        b.stop();
        b.accelerate();
        b.brake();
    }
}

