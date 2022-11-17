package CARRY_FORWARD_PRO;

public class ADD_1 {
 public static void main(String[] args) {
	int n=125469,r,sum=0,sum1=0;
	for(;n>0;n/=10) {
		r=n%10;
		if(r==9) {
			r=0;
		}
		else {
			r=r+1;
		}
		sum=sum*10+r;
		
	}
	//System.out.println(sum);
	int n2=sum;
	for(;n2>0;n2/=10) {
		r=n2%10;
		sum1=sum1*10+r;

	}
	int f_no=sum1*10;
	System.out.println(f_no);
	
}
}
