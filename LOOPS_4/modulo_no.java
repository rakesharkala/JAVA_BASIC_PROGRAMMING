package LOOPS_4;

public class modulo_no {
public static void main(String[] args) {
	int n=2345,r,sum1=0,sum2=1,count=0;
	for(;n>0;n=n/10) {
		count++;
		if(count==1||count==4) {
			r=n%10;
			sum2*=r;
		}
		else {
			r=n%10;
			sum1+=r;
		}
	}
	System.out.println(sum1+sum2);
	
}
}
