package STRINGS_CHAPTER_2;
//28.	Write a Java program to replace a specific word by “codinghub” in the given array

public class Q8_REPLACE_METHOD
{
	public static void main(String[] args) 
	{
		String s="coding hub";
		s=s.replaceAll("coding hub", "hello");  //replace all replace the word 
		System.out.println(s);                   // replace will replace the charecter 
		
	}

}
