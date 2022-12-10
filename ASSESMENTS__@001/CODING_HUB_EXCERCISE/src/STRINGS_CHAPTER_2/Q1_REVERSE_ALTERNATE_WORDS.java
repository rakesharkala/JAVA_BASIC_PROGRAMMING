package STRINGS_CHAPTER_2;
//21.	Write a java program to reverse alternative words in a String array

public class Q1_REVERSE_ALTERNATE_WORDS 
{
	public static void main(String[] args)
	{
		String s="HII RAKESH THIS IS TIME TO PROVE YOUR SELF";
		s=s.trim();
		
		String a[]=s.split(" ");
		
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				for(int j=a[i].length()-1;j>=0;j--)
				{
					System.out.print(a[i]);
				}
			}
			else if(i%2!=0)
			{
				System.out.println(a[i]);
			}
			else
			{
				System.out.println(" ");
			}
		}
		
		
		
	}

}
