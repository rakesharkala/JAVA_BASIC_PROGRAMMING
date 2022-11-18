package ASSESMENT_1;

public class PRIME_RANGE
{
	public static void main(String[] args)
	{
		int start=2,end=40,alter=0;
		for(;start<end;start++)
		{
			int count=0;
			for(int i=1;i<=start;i++) 
			{
				if(start%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				if(alter%2==0) 
				{
				System.out.println("prime :  "+start);
			    }
				alter++;
			}
		}
	}
}
