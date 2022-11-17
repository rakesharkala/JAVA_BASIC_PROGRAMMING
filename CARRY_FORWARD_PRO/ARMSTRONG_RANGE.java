package CARRY_FORWARD_PRO;

public class ARMSTRONG_RANGE {
	public static void main(String[] args) {
		
		int start=100,end=1500,r;
		
		for(;start<end;start++)
		{
			int count=0;
			double sum=0;
			
			for(int x=start;x>0;x/=10)
			{
				count++;
				
			}
			for(int x=start;x>0;x/=10)
			{
				r=x%10;
				sum= sum+Math.pow(r, count);
				
			}
	
			if(start==sum) 
			{
				System.out.println(start);
				
		     }
		}
	}

}



