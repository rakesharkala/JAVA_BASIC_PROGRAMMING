package LOOPS_4;

public class AAD_1_TO_NO 
{
 public static void main(String[] args) 
 {
	
	 int n=12459,r,sum=0;
	 for(;n>0;n/=10) 
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
	 int s=0;
	for(;sum>0;sum/=10) 
	{
		r=sum%10;
		s=s*10+r;
		
	}
	s=s*10;
	System.out.println(s);
}
}
