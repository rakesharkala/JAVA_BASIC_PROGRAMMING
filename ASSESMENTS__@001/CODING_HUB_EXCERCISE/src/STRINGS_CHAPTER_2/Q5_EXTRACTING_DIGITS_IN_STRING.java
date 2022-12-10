package STRINGS_CHAPTER_2;
//24.	Write a Java program to find the sum of integers in String
//a.	A1B2C3=>1+2+3 = 6

public class Q5_EXTRACTING_DIGITS_IN_STRING 
{
	public static void main(String[] args)
	{
		String s="A1B2C3";
	
		int sum=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
				sum+=(s.charAt(i)-'0');
			}
		}
		System.out.println(sum);
	}

}
