package ASSESMENT_2;

public class ADD1_TO_NO {
	public static void main(String[] args) {
		
		int n=4999,r=0,sum1=0,sum2=0,count=0;
		
		for(;n>0;n/=10)
		{
			count++;
			r=n%10;
			if(r==9)
			{
				r=0;
			}
			else
			{
				r=r+1;
			}
			sum1=sum1*10+r;
		}
		//System.out.println(sum1);
		for(int i=count;i>=1;i--)
		{
			r=sum1%10;
			sum2=sum2*10+r;
			sum1=sum1/10;
		}
		System.out.println(sum2);
	}

}
