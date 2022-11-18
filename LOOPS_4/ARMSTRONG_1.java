package LOOPS_4;

public class ARMSTRONG_1 {
	public static void main(String[] args) {
		
		int n=153,r,sum=0,temp;
		temp=n;
		for(;n>0;n/=10) {
			r=n%10;
			sum=sum+r*r*r;
			
		}
		System.out.println((temp==sum)?"ARMSTRONG":"NOT ARMSTRONG");
	
	}

}
