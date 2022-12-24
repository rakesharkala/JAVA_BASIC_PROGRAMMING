package OOPS;

import java.util.Scanner;


public class SINGLE_LEVEL_INHARITANCE 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String ch;
		sub o=new sub();       // OBJECT CREATION TO THE CHILD CLASS 
		
		do {
			o.dis();           //METHOD CALLING 
			
			System.out.println("\n\nENTER UR CHOICE :  ");
			ch=sc.next();                
		}while(ch.equalsIgnoreCase("yes"));
		
		o.cl();                // METHOD CALLING AT THE END 
	}
}
