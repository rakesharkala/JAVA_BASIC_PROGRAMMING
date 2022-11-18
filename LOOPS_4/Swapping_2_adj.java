package LOOPS_4;

public class Swapping_2_adj {
	
	public static void main(String[] args) {
		
		int n=1234,r,n1,n2,sum1=0,sum2=0;
		n1=n%100;
		n2=n/100;
		while(n1>0) {
			r=n1%10;
			sum1=sum1*10+r;
			n1=n1/10;
			
		}
	//	System.out.println(sum1);
		while (n2>0) {
		r=n2%10;
		sum2=sum2*10+r;
		n2=n2/10;
	}
	System.out.println(sum2+""+sum1);

}}