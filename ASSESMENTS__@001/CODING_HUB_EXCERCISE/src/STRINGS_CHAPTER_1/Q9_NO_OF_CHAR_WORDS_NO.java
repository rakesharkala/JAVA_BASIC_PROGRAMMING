package STRINGS_CHAPTER_1;

public class Q9_NO_OF_CHAR_WORDS_NO
{
	public static void main(String[] args)
	{
		String c="HELLO ALL GOOD MORNING";
		c=c.trim();  // remove white spaces both ends 
		String a[]=c.split(" ");   // based on barsec that words/char deleted and store in an array
		System.out.println(a.length);
		
	}

}
