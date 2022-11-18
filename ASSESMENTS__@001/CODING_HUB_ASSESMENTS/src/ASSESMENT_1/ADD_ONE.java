package ASSESMENT_1;

public class ADD_ONE 
{
	public static void main(String[] args)
	{
		int n=479,r,sum=0,sum1=0;
		for(;n>0;n=n/10)
		{
			r=n%10;
			if(r==9) 
			{
				r=0;
			}
			else
			{
				r=r+1;
			}
			sum=sum*10+r;
			
		}
		for(;sum>0;sum/=10)
		{
			r=sum%10;
			sum1=sum1*10+r;
			
			
		}
		int fv=sum1*10;
		System.out.println(fv);
	}

}
