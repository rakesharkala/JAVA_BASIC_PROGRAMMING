package STRINGS_CHAPTER_1;

import java.util.Arrays;
import java.util.Scanner;

public class QN19_ANAGRAM 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER TWO STRING : ");
		String s=sc.next();
		String s1=sc.next();
		String x="",y="";
		char c[]=s.toCharArray();
		char c1[]=s.toCharArray();
		
		Arrays.sort(c);
		Arrays.sort(c1);
		
		for (char d : c1) {
			x=x+d;
		}
		for (char d : c) {
			y=y+d;
		}
		if(x.equalsIgnoreCase(y))
		{
			System.out.println("ANAGRAM ");
			
		}
		else
		{
			System.out.println("NOT ANAGRAM ");
		}
	}

}
