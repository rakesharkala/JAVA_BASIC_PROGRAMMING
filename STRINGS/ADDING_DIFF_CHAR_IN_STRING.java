package STRINGS;

public class ADDING_DIFF_CHAR_IN_STRING 
{
	public static void main(String[] args)
	{
		String s="hello all";
		
//		s=s.replace('l', '@');
//		s=s.replace(' ','#');
		
		for(int i=0;i<s.length();i++)
		{
			if (s.charAt(i)=='l')
			{
				s=s.replace('l', '@');
			}
			else if(s.charAt(i)==' ')
			{
				s=s.replace(' ', '#');
			}
		}
		System.out.print(s);
		
	}
    

}
