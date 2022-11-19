package ASSESMENT_2;

public class PALINDROMIC_PRIME {
	public static void main(String[] args) {
		
		int start =10,end =100000;
		
		for (;start<end ;start++)
		{
			int sum=0,r=0,count=0;
			int x=start;
			for(;x>0;x/=10)
			{
				r=x%10;
				sum=sum*10+r;
				
			}
			if(sum==start)
			{
		
				for(int i=2;i<sum/2;i++)
				{
					if(sum%i==0)
					{
						count++;
					}
				}
				if(count==0)
				{
					System.out.println(start);
				}
				
			}
		}
	}

}
