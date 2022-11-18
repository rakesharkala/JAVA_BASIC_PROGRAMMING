package STRINGS_CHAPTER_1;

public class Q7_COUNT_ALL_TYPES {
	public static void main(String[] args) 
	{

	String name="SATHYA1@2a";
	int lc=0,uc=0,n=0,symbol=0;
	
	for(int i=0;i<name.length();i++)
	{
		char s=name.charAt(i);
		if(s=='a'||s=='z')
		{
			lc++;
		}
		else if(s=='A'||s=='Z')
		{
			uc++;
		}
		else if(s=='0'||s=='9')
		{
			n++;
		}
		else {
			symbol++;
		}
		
	}
	System.out.println(lc+"  "+uc+"  "+n+"  "+symbol);

}
}