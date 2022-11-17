package CARRY_FORWARD_PRO;

public class SWAP_ADJACENTS {

	public static void main(String[] args) {
		
		int n=368548,r=0,sum1=0,sum2=0,sum3=0,count=0;
		
			for(;n>0;n/=100)
			{
				count++;
				r=n%100;
			
				int rem=0;
				if(count==1)
				{    
					
					for(;r>0;r/=10)
					{
						rem=r%10;
						sum1=sum1*10+rem;
					}
				}
				
				if(count==2)
				{    	
					for(;r>0;r/=10)
					{
						rem=r%10;
						sum2=sum2*10+rem;
					}
				}
				if(count==3)
				{    	
					for(;r>0;r/=10)
					{
						rem=r%10;
						sum3=sum3*10+rem;
					}
				}
			}
		
			System.out.println(sum3+""+sum2+""+sum1);
	}

}

