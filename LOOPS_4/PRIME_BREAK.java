package LOOPS_4;

public class PRIME_BREAK {

	
	public static void main(String[] args) {
		int n=9,r,count=0,temp;
		temp=n;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0) {
				count++;
				break;	
			}
		}
		System.out.println(count==temp?"prime":"not prime"); 
	
		
	}
}
