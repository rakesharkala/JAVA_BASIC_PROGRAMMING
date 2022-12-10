package STRINGS_CHAPTER_1;

import java.util.Scanner;

public class QN18_STRING_PALINDROME
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.print("ENTER A  STRING : ");
	String s=sc.next();
	
	boolean x=QN18_STRING_PALINDROME.check(s);
	
	if(x==true)
	System.out.println("PALINDROME !!");
	
	else System.out.println("NOT PALINDROME !!");
 
	
}
public static boolean check(String s)
{
	
	int i=0;
	int j=s.length()-1;
	while(i<j)
	{
		if(s.charAt(i)!=s.charAt(j))
		{
			return false;
			
		}
		else {
			i++;
			j--;
		}
	}
	return true;
	
}
}
