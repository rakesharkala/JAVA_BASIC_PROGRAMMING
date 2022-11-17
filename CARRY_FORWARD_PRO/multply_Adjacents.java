package CARRY_FORWARD_PRO;
/*
 368548
Multiple 8&4
Multiple 5&8
Multiple 6&3
Add all those three values
O/p=32+40+18=90
 You take a Same number swap 3 replace 6
8 replace 5
4 replace 8
O/p=635884
*/

public class multply_Adjacents {
	public static void main(String[] args) {
		
		int n=368548,r=0,sum1=1,sum2=1,sum3=1,count=0,s1,s2,s3;
		
			for(;n>0;n/=100)
			{
				count++;
				r=n%100;
			
				int rem=0;
				if(count==1)
				{    
					s1=r;
					for(;r>0;r/=10)
					{
						rem=r%10;
						sum1=sum1*rem;
					}
				}
				if(count==2)
				{    	
					for(;r>0;r/=10)
					{
						rem=r%10;
						sum2=sum2*rem;
					}
				}
				if(count==3)
				{    	
					for(;r>0;r/=10)
					{
						rem=r%10;
						sum3=sum3*rem;
					}
				}
			}
			int f_sum=sum1+sum2+sum3;
			System.out.println(f_sum);
	}

}
