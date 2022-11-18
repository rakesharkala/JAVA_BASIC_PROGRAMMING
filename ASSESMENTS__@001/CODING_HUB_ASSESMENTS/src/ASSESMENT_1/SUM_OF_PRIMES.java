package ASSESMENT_1;

public class SUM_OF_PRIMES {
	
	public static void main(String[] args) {
		
		
	  int start=2,end=40,sum=0,alt=0;
	  for(;start<=end;start++)
	  {
		  int count=0;
		  for(int i=2;i<start;i++)
		  {
			  if(start%i==0)
			  {
				  count++;
				  
			  }
		  }
		  if(count==0)
		  {     
			  if(alt%2==0) {
			  sum=sum+start;
			  System.out.println(start);
			  }
			  alt++;
			
		  }
	  }
	  System.out.println("the sum of prime no :  "+sum);
	}

}
