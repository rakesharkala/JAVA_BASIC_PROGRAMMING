package STRINGS_CHAPTER_1;
//12.	Write a Java program to find the duplicate characters in a String 

public class QN12_DUBLICATE_CAHR_IN_STRING
{
	public static void main(String[] args) 
	{
		String s="rakaeesh";
		char a[]=s.toCharArray();
		
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
			if(a[i]==a[j])
			{
				a[i]= '_';
			}
			}
		}
		for(int i=0;i<s.length();i++)
		{
			if(a[i]=='_')
			{
				System.out.println(s.charAt(i));
			}
		}
		
		
	}

}
