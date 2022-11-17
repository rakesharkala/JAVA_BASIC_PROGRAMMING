package BASIC;
public class reverse {
	public static void main(String[] args) {
		int r,sum=1;
		
		for(int  n=1237;n>0;n=n/10) {
			r=n%10;
			sum*=r;
		}
		System.out.println(sum);
		
	}

}
