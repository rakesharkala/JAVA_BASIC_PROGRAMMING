package LOOPS_4;

public class number_1 {
	
	public static void main(String[] args) {
		
		int n=123459,r,sum=0;
		for(;n>0;n=n/10) {
			r=n%10;
			
			if(r==9) {
			r=0;
			}
			else {
				r=r+1;
			}
			
			sum=sum*10+(r+1);
			
		}
		System.out.println(sum);
		int no=sum,sum1=0;
		for(;no>0;no/=10) {
			r=no%10;
			sum1=sum1*10+r;
			
		}
		System.out.println(sum1);
		
		
	}
	

}
