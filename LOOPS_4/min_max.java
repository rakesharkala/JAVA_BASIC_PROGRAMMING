package LOOPS_4;

public class min_max 
{
	public static void main(String[] args) 
	{
		int min=2,max=2;
		int n=24513247,r;
		
		for(;n>0;n/=10)
		{
			r=n%10;
			
			if(min>r) 
			{
				min=r;
			}
			if(max<r)
			{
				max=r;
			}
		}
		System.out.println(min+" \n  "+max);
	}
}
