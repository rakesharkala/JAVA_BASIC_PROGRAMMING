package STRINGS;

import java.util.Scanner;

public class VOWELS_CONSONENTS 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("ENTER A STRING : ");
		String s=sc.next();
		int c=0,v=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
				v++;
			else c++;
		}
		System.out.println("VOWELS : "+v+ "\nCONSONENTS : "+c);
		
		
		
	}

}
