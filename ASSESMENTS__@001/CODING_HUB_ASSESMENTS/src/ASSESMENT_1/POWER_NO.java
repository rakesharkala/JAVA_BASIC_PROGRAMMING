package ASSESMENT_1;

public class POWER_NO {
	
	public static void main(String[] args) {
		int n=132,sum1=0,sum2=1,r;
		
		while(n>0) {
			r=n%10;
			n=n/10;
			sum1=sum1+r;
			sum2=sum2*r;
			
		}
		String s=(sum1==sum2)?"power no":"not power no";
		System.out.println(s);
	}

}
