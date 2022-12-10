package STRINGS_CHAPTER_2;

import java.util.Scanner;

//26.	Write a Java program to create a String Using String Buffer and String Builder

public class Q6_STRING_BUFFER_BUILDER
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		StringBuilder name=new StringBuilder("rakesh ");
		
		
		System.out.println(name.append("  yadav"));
		System.out.println(name.delete(7, 9));
		System.out.println(name.charAt(5));
		System.out.println(name.insert(7, "ARKALA "));
		System.out.println(name.length());
		
		
		
	}

}
