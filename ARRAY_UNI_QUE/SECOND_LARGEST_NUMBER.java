package ARRAY_UNI_QUE;

public class SECOND_LARGEST_NUMBER {

	public static void main(String[] args)
	{
		int n=61758995,rem=0,first=0,second=0;
		
		for (;n>0;n/=10)
		{
			rem=n%10;
			if(first<rem)
			{
				second=first;
				first=rem;
			}
			else if(rem>second&&rem<first)
			{
				second =rem;
				
			}
		}
		System.out.println("SECOND LARGEST NO IS : "+second);
		
		
	}
}
