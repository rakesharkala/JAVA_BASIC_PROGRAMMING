package ASSESMENT_1;

public class ADD1_2ND_METHOD {
	public static void main(String[] args) {
		
		int n=5969,count=0,r,sum1=0,sum2=0;
		
		for(;n>0;n/=10)
		{
			count++;
			r=n%10;
			
			if(r==9)
			{
				r=0;
			}
			else {
				r=r+1;
				
			}
			
			sum1=sum1*10+r;
		}
		System.out.println(sum1);
	
		for(int i=count;i>0;i--)
		{
			r=sum1%10;
			sum1/=10;
			sum2=sum2*10+r;
		}
		System.out.print(sum2);
	}
}
