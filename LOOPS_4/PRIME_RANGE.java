
package LOOPS_4;

public class PRIME_RANGE {
	public static void main(String[] args) {
		
		int start=2,end=40;
		
		for(;start<end;start++)
		{
			int count=0,c2=0;
		     int ct=0;
		  for(int i=c2 ;i<start/2;c2++)
		  {
			  if(start%i==0) {
				  count++;
				  
			  }
			  c2++;
		  }
		  if(count==2) {
			  System.out.println(start+" ===== prime");
		  }
		}
	}
	
}
