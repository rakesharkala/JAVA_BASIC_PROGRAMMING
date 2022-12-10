package STRINGS;

public class CHAR_OP_LC_UC 
{
	public static void main(String[] args)
	{
		String s="Hello all Good Morning";
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
		if(Character.isUpperCase(c)&&s.charAt(x)!=' ')
			{
				c=Character.toLowerCase(c);
				System.out.print(c);
			}else if(Character.isLowerCase(c)&&s.charAt(x)!=' ')
			{
				c=Character.toUpperCase(c);
				System.out.print(c);
			}
			else {
				System.out.print(" ");
			}
		}
	}

}
