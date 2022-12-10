package STRINGS_CHAPTER_1;
//17.	Write a Java program to compare two String using compareToIgnoreCase()

public class QN17_comapareToIgnore 
{
	public static void main(String[] args) 
	{
		String s="HELLO";
		String s1="HELlo";
		int  q=s.compareToIgnoreCase(s1);
		
		System.out.println(q);
		
		if(s.equalsIgnoreCase(s1))
		{
			System.out.println("EQUAL");
		}
		else
		{
			System.out.println("NOT EQUAL");
		}
	}

}
