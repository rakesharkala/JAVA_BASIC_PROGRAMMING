package STRINGS_CHAPTER_1;
//2.	Write a Java Program to print a string in reverse order
public class Q2_STRING_REVERSE {
	public static void main(String[] args) {
		
		String s="anil yadav";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}

}
